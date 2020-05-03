package StudentsDatabase.Controler;

import StudentsDatabase.Objects.Student;
import StudentsDatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
