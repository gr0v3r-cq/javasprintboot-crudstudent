package com.crud.students.controlador;

import com.crud.students.servicio.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllerStudent {
    @Autowired
    private ServiceStudent service;

    @GetMapping({"/student","/"})
    public String listStudents(Model model){
        model.addAttribute("student", service.listAllStudents());
        return "student";
    }

    @GetMapping("/main")
    public  String principal(){
        return "hello world....";
    }

}
