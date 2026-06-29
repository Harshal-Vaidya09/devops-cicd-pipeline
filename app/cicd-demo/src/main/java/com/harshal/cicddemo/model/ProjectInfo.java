package com.harshal.cicddemo.model;

public class ProjectInfo {

    private String developer;
    private String application;
    private String buildTool;
    private String ciTool;
    private String container;
    private String orchestrator;
    private String environment;
    private String company;
    private String status;

    public ProjectInfo(String developer, String application,
                       String buildTool, String ciTool,
                       String container, String orchestrator, String environment, 
                       String company, String status) {
        this.developer = developer;
        this.application = application;
        this.buildTool = buildTool;
        this.ciTool = ciTool;
        this.container = container;
        this.orchestrator = orchestrator;
        this.environment = environment;
        this.company = company;
        this.status = status;
    }

    public String getDeveloper() { return developer; }
    public String getApplication() { return application; }
    public String getBuildTool() { return buildTool; }
    public String getCiTool() { return ciTool; }
    public String getContainer() { return container; }
    public String getOrchestrator() { return orchestrator; }
    public String getEnvironment() { return environment; }
    public String getCompany() { return company; }
    public String getStatus() { return status; }
}