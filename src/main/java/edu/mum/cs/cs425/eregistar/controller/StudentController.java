package edu.mum.cs.cs425.eregistar.controller;

import edu.mum.cs.cs425.eregistar.model.Student;
import edu.mum.cs.cs425.eregistar.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

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
        modelAndView.addObject("studentsCount", students.size());
        modelAndView.setViewName("student/list");
        return modelAndView;
    }

    @GetMapping(value = "/student/new")
    public String displayAddNewStudentForm(Model model){
        model.addAttribute("student" , new Student());
        return "student/new";
    }

    @PostMapping(value = "/student/new")
    public String saveStudent(@Valid @ModelAttribute Student student, BindingResult bindingResult,
                              Model model){

        if(bindingResult.hasErrors()){
            model.addAttribute("student", student);
            model.addAttribute("errors" , bindingResult.getAllErrors());
            return "/student/new";
        }

        this.studentService.saveStudent(student);

        return "redirect:/student";
    }

    @GetMapping(value = "/student/update")
    public String displayUpdateForm(@RequestParam long id, Model model){
        Optional<Student> student = this.studentService.getOneStudent(id);

        if (!student.isPresent()) return "redirect:/student";

        model.addAttribute("student" , student.get());
        return "student/update";
    }
}
