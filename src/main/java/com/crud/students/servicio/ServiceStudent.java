package com.crud.students.servicio;

import com.crud.students.entidad.Student;

import java.util.List;

public interface ServiceStudent {
    public List<Student> listAllStudents();

    public Student saveStudent(Student student);

    public Student getStudentById(Long id);

    public  Student updateStudent(Student student);

    public void deletStudent(Long id);

}
