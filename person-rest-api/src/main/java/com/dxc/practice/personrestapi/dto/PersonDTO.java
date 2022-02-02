package com.dxc.practice.personrestapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Integer id;
    private String name;
    private LocalDate dob;
    private String address;
    private String email;   
}
