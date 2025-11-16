package edu.iect.service.impl;

import edu.iect.dto.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    Student createStudent(Student student);

    Student getStudentById(Long studentId);

    List<Student> getAllStudent();
}
