package com.hust.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "score_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scoreId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    private Double score1;
    private Double score2;

    @Transient
    public String getGrade() {
        if (score1 == null || score2 == null) return "F";
        double finalScore = 0.3 * score1 + 0.7 * score2;
        if (finalScore >= 8) return "A";
        if (finalScore >= 6) return "B";
        if (finalScore >= 4) return "D";
        return "F";
    }
}
