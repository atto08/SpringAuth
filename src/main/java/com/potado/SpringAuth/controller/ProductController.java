package com.potado.SpringAuth.controller;

import com.potado.SpringAuth.entity.User;
import com.potado.SpringAuth.security.UserDetailsImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public String getProducts(@AuthenticationPrincipal UserDetailsImpl userDetails) {

        User user = userDetails.getUser();
        System.out.println("user.getUsername() = " + user.getUsername());

        return "redirect:/";
    }
}