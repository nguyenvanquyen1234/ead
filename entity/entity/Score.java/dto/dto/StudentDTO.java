package com.hust.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    private Integer studentId;
    private String studentCode;
    private String fullName;
    private String address;
}
