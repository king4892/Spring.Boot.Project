package com.springboot.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.sistema.entity.Student;


@Repository 
public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
