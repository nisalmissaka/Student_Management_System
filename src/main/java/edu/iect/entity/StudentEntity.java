package edu.iect.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class StudentEntity {
    @Id
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String gender;
    private int age;
    private LocalDate dob;
    private String grade;
    private Double gpa;
}
