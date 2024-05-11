package com.hamtechproject.dto;

import com.hamtechproject.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private  Long id;
    private String name;
    private String email;
    private UserRole userRole;
}
