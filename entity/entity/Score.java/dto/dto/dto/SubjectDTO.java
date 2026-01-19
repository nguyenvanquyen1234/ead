package com.hust.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubjectDTO {
    private Integer subjectId;
    private String subjectCode;
    private String subjectName;
    private Integer credit;
}
