package com.hust.controller;

import com.hust.dto.ScoreDTO;
import com.hust.dto.StudentInfoDTO;
import com.hust.service.ScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scores")
@CrossOrigin("*")
public class ScoreController {

    private final ScoreService service;

    public ScoreController(ScoreService service) {
        this.service = service;
    }

    @PostMapping
    public ScoreDTO create(@RequestBody ScoreDTO dto) {
        return service.createScore(dto);
    }

    @GetMapping("/student-info")
    public List<StudentInfoDTO> getStudentInfo() {
        return service.getAllStudentInfo();
    }
}
