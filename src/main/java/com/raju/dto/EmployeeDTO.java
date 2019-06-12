package com.raju.dto;

import com.raju.enums.Gender;
import lombok.Data;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Data
public class EmployeeDTO implements Serializable {

    private String firstName;

    private String lastName;

    private String preferredName;

    private String email;

    private String phoneNumber;

    private Gender gender;

    private OffsetDateTime dateOfBirth ;

}
