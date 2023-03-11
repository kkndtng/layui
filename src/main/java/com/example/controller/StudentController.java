package com.example.controller;

import com.example.pojo.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/Student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/test_passage")
    public String test(){
        return "test";
    }


    @ResponseBody
    @GetMapping
    @CrossOrigin
    public List<Student> getAllStudent(){
        List<Student> students = studentService.getAll();
        return students;
    }
}
