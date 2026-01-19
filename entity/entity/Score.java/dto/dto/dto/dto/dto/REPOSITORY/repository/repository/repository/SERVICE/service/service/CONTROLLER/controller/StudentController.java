package com.hust.controller;

import com.hust.dto.StudentDTO;
import com.hust.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public StudentDTO create(@RequestBody StudentDTO dto) {
        return service.createStudent(dto);
    }

    @GetMapping
    public List<StudentDTO> getAll() {
        return service.getAllStudents();
    }
}
