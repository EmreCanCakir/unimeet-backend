package edu.unimeet.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserUpdateDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    private String firstName;

    private String lastName;

    private String userName;

    private String gender;

    private String email;

    private String phoneNumber;

    private String userBio;

    private String userPassword;
}
