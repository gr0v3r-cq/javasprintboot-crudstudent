package com.crud.students.repositorio;

import com.crud.students.entidad.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryStudent extends JpaRepository<Student, Long> {
}
