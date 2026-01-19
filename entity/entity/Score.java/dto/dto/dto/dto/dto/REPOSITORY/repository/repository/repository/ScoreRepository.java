package com.hust.repository;

import com.hust.dto.StudentInfoDTO;
import com.hust.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Integer> {

    @Query("""
        SELECT new com.hust.dto.StudentInfoDTO(
            s.scoreId,
            st.studentCode,
            st.fullName,
            sub.subjectName,
            s.score1,
            s.score2,
            sub.credit,
            ''
        )
        FROM Score s
        JOIN s.student st
        JOIN s.subject sub
    """)
    List<StudentInfoDTO> findAllStudentInfo();
}
