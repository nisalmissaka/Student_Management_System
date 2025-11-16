package edu.iect.service.impl;

import edu.iect.dto.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public Student createStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudentById(Long studentId) {
        return null;
    }

    @Override
    public List<Student> getAllStudent() {
        return List.of();
    }
}
