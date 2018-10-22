package com.yousef.androidbackendapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/user1")
    public String getTestUser1() {
        return "Yousef Abu Amireh";
    }

    @GetMapping("/user2")
    public String getTestUser2() {
        return "Rami Nassar";
    }

    @GetMapping("/user3")
    public String getTestUser3() {
        return "Tariq Abu Amireh";
    }
}