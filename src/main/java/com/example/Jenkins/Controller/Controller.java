package com.example.Jenkins.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
    @GetMapping("/j")
    public String jenkins(Model model) {
        return "jenkins";

    }
}
