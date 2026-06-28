package com.harshal.cicddemo.controller;

import com.harshal.cicddemo.model.ProjectInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public ProjectInfo home() {

        return new ProjectInfo(
                "Harshal Vaidya",
                "Enterprise CI/CD Pipeline",
                "2.0",
                "Maven",
                "Jenkins",
                "Docker",
                "Kubernetes",
                "DEPLOYED ON KUBERNETES"
        );
    }
}