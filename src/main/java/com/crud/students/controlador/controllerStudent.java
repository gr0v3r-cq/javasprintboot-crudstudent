package com.crud.students.controlador;

import com.crud.students.entidad.Student;
import com.crud.students.servicio.ServiceStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/student/edit/{id}")
    public String seeFormStudentEdit(@PathVariable Long id, Model model){
        model.addAttribute("student", service.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/student/{id}")
    public  String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model){
        Student existentStudent = service.getStudentById(id);
        existentStudent.setId(id);
        existentStudent.setName(student.getName());
        existentStudent.setLastname(student.getLastname());
        existentStudent.setEmail(student.getEmail());

        service.updateStudent(existentStudent);
        return "redirect:/student";
    }

    @GetMapping("/student/delete/{id}")
    public String deletedStudent(@PathVariable Long id){
        service.deletStudent(id);
        return "redirect:/student";
    }

}
