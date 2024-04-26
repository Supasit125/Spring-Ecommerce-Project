package com.nightmarket.shop.controller;

import com.nightmarket.shop.global.GlobalData;
import com.nightmarket.shop.repository.RoleRepository;
import com.nightmarket.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/load")
    public String login() {
        GlobalData.cart.clear();
        return "login";
    }
    @GetMapping("/register")
    public String registerGet() {
        return "register";
    }
}
