package edu.iect.repository;

import edu.iect.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;

@Repository
public interface SrudentRepository extends JpaRepository<Student,Long> {
}
