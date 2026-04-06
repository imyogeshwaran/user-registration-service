package com.demo;
import jakarta.validation.constraints.*;

public class User {
    @NotBlank @Email public String email;
    @Size(min = 8) public String password;
}
