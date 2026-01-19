package com.hust.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentInfoDTO {
    private Integer id;
    private String studentId;
    private String studentName;
    private String subjectName;
    private Double score1;
    private Double score2;
    private Integer credit;
    private String grade;
}
