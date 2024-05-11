package com.hamtechproject.services.auth;

import com.hamtechproject.dto.SignupRequest;
import com.hamtechproject.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);
    boolean hasCustomerWithEmail (String email);
}
