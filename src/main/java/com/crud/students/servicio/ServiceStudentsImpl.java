package com.crud.students.servicio;

import com.crud.students.entidad.Student;
import com.crud.students.repositorio.RepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudentsImpl implements ServiceStudent{

    @Autowired
    private RepositoryStudent repository;

    @Override
    public List<Student> listAllStudents(){
         return repository.findAll();
     }
}
