package com.example.capstone3.DTO;


import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class VolunteerDTOin {


    private String name;


    private String email;


    private String phoneNumber;




    private Integer age;


    private String gender;


}
