package com.hust.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "subject_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subjectId;

    @Column(nullable = false, length = 20)
    private String subjectCode;

    @Column(nullable = false, length = 100)
    private String subjectName;

    private Integer credit;
}
