package com.etrack.ems.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
    @PostMapping("/login")
    private String loginUser(@RequestBody String email, String password) {
        return "User has been successfully logged in";
    }

    @PostMapping("/register")
    private String RegisterUser(@RequestBody String firstname, String lastname, String email, String password) {
        return "User has been successfully registered";
    }

    @GetMapping("/send-mail")
    private String SendMail(@RequestBody String mail) {
        return "Otp has been sent to your email address";
    }

    @GetMapping("/verify-otp")
    private String VerifyOtp(@RequestBody String otp) {
        return "Otp is found to be correct and now proceeding to reset password";
    }

    @PutMapping("/reset-password")
    private String ResetPassword(@RequestBody String password) {
        return "Password has been reset successfully";
    }

    @GetMapping("/start/mfa")
    private String StartMfa(@RequestBody String mail) {
        return "View your OTP in the authenticator application";
    }
}
