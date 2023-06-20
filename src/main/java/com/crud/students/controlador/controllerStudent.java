package com.crud.students.controlador;

import com.crud.students.entidad.Student;
import com.crud.students.servicio.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controllerStudent {
    @Autowired
    private ServiceStudent service;

    @GetMapping({"/student","/"})
    public String listStudents(Model model){
        model.addAttribute("student", service.listAllStudents());
        return "student";
    }

    @GetMapping("/student/new")
    public  String seeFormStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/student")
    public String saveStudentPost(@ModelAttribute("student") Student student){
        service.saveStudent(student);
        return "redirect:/student";
    }

}
