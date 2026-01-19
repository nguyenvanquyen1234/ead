package com.hust.service;

import com.hust.dto.StudentDTO;
import com.hust.entity.Student;
import com.hust.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public StudentDTO createStudent(StudentDTO dto) {
        Student s = new Student(null, dto.getStudentCode(), dto.getFullName(), dto.getAddress());
        return toDTO(repo.save(s));
    }

    public List<StudentDTO> getAllStudents() {
        return repo.findAll().stream().map(this::toDTO).collect(Collectors.toList());
    }

    private StudentDTO toDTO(Student s) {
        return new StudentDTO(s.getStudentId(), s.getStudentCode(), s.getFullName(), s.getAddress());
    }
}
