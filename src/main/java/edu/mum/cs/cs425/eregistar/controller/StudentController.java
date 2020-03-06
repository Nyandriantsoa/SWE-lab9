package edu.mum.cs.cs425.eregistar.controller;

import edu.mum.cs.cs425.eregistar.model.Student;
import edu.mum.cs.cs425.eregistar.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    private IStudentService studentService;

    @Autowired
    public StudentController(IStudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping(value = "/student")
    public ModelAndView displayAllStudents(){
        List<Student> students = this.studentService.getAllStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students", students);
        modelAndView.setViewName("student/list");
        return modelAndView;
    }

}
