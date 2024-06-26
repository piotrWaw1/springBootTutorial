package pl.wawrzenczyk.springboottutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping("")
    public List<Student> getStudent() {

        return studentService.getStudent();
    }

    @PostMapping("") // @RequestBody download data form request body in JSON
    public void registerNewStudent(@RequestBody Student student) {

        studentService.addNewStudent(student);
    }

}

//stack builder