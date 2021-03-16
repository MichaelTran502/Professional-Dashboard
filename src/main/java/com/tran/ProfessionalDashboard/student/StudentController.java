package com.tran.ProfessionalDashboard.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(1L, "jamila", "jamilia@amigoscode.edu", Gender.FEMALE),
                new Student(2L, "alex", "alex@amigoscode.edu", Gender.MALE)
        );

        return students;
    }
}
