package com.example.fabjsptest.controller;


import com.example.fabjsptest.entity.Student;
import com.example.fabjsptest.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listStudents", service.listAll());
        return "index";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.save(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("student", service.get(id));
        return "edit";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("student") Student student) {
        service.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        service.delete(id);
        return "redirect:/";
    }
}
