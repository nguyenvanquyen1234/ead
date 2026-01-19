package com.hust.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreDTO {
    private Integer scoreId;
    private Integer studentId;
    private Integer subjectId;
    private Double score1;
    private Double score2;
}
