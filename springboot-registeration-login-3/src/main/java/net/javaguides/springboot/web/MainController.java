package net.javaguides.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.service.UserService;
import net.javaguides.springboot.service.UserServiceImpl;

@Controller
public class MainController {
	
	private final UserServiceImpl userServiceImpl;
	
	@Autowired
    public MainController(UserServiceImpl service) {
        this.userServiceImpl = service;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/index")
    public String postYourPage() {
        // Handle POST request here
        return "index";
    }
	
	
}