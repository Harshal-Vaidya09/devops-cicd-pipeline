package com.harshal.cicddemo.controller;

import com.harshal.cicddemo.model.ProjectInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${APP_NAME:Unknown}")
    private String appName;

    @Value("${ENVIRONMENT:Unknown}")
    private String environment;

    @Value("${COMPANY:Unknown}")
    private String company;

    @Value("${DB_USERNAME:Unknown}")
    private String dbUsername;

    @Value("${DB_PASSWORD:Unknown}")
    private String dbPassword;

    @GetMapping("/")
    public ProjectInfo home() {

        return new ProjectInfo(
                "Harshal Vaidya",
                appName,
                "4.0",
                "Maven",
                "Jenkins",
                "Docker",
                "Kubernetes",
                environment,
                company,
                dbUsername,
                dbPassword,
                "DEPLOYED ON KUBERNETES"
        );
    }
}