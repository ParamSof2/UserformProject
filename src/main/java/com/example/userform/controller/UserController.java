package com.example.userform.controller;

import com.example.userform.model.User;
import com.example.userform.repository.UserRepository;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute User user) {
        userRepository.save(user);
        return "success";
    }
    
   @GetMapping("/getall")
    public String getAllUser(Model model) {
    	List<User> userList = userRepository.findAll();
    	model.addAttribute("users", userList);
       
        return "list";
    }
    
    
}
