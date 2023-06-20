package com.crud.students;

import com.crud.students.entidad.Student;
import com.crud.students.repositorio.RepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}

	@Autowired
	private RepositoryStudent repository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("gr0v3r","cq","correo@correo.com");
		repository.save(student1);

		Student student2 = new Student("gr0","cq","correo1@correo.com");
		repository.save(student2);*/
	}
}
