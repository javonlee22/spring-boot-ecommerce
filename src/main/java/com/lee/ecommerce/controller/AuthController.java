package com.lee.ecommerce.controller;

import com.lee.ecommerce.entity.User;
import com.lee.ecommerce.request.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @PostMapping(value = "/login")
    public ResponseEntity<User> login(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/logout")
    public void logout(HttpServletRequest req) {
        return;
    }

}
