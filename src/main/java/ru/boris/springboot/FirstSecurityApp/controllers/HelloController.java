package ru.boris.springboot.FirstSecurityApp.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.boris.springboot.FirstSecurityApp.models.Person;
import ru.boris.springboot.FirstSecurityApp.security.PersonDetails;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();
        Person person = personDetails.getPerson();
        model.addAttribute("person", person);
        return "hello";
    }

    @GetMapping("/showUserInfo")
    public String showUserInfo(Model model) {
        return "hello";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }
}
