package pl.wawrzenczyk.springboottutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jan = new Student(
                    "Jan",
                    "jan@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 10)
            );
            Student roman = new Student(
                    "Roman",
                    "roman@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 22)
            );
            repository.saveAll(
                    List.of(jan, roman)
            );
        };
    }
}
