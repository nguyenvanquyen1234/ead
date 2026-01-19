package com.hust.service;

import com.hust.dto.ScoreDTO;
import com.hust.dto.StudentInfoDTO;
import com.hust.entity.Score;
import com.hust.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    private final ScoreRepository scoreRepo;
    private final StudentRepository studentRepo;
    private final SubjectRepository subjectRepo;

    public ScoreService(ScoreRepository s, StudentRepository st, SubjectRepository sub) {
        this.scoreRepo = s;
        this.studentRepo = st;
        this.subjectRepo = sub;
    }

    public ScoreDTO createScore(ScoreDTO dto) {
        Score score = new Score(
                null,
                studentRepo.findById(dto.getStudentId()).orElseThrow(),
                subjectRepo.findById(dto.getSubjectId()).orElseThrow(),
                dto.getScore1(),
                dto.getScore2()
        );
        Score saved = scoreRepo.save(score);
        return new ScoreDTO(saved.getScoreId(), dto.getStudentId(), dto.getSubjectId(),
                saved.getScore1(), saved.getScore2());
    }

    public List<StudentInfoDTO> getAllStudentInfo() {
        return scoreRepo.findAllStudentInfo();
    }
}
