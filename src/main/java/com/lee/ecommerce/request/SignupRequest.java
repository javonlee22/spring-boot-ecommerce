package com.lee.ecommerce.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
    private String password;
}
