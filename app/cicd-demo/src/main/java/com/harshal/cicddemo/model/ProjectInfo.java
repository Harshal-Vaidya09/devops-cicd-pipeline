package com.harshal.cicddemo.model;

public class ProjectInfo {

    private String developer;
    private String application;
    private String version;
    private String buildTool;
    private String ciTool;
    private String container;
    private String orchestrator;
    private String status;

    public ProjectInfo(String developer, String application, String version,
                       String buildTool, String ciTool,
                       String container, String orchestrator, String status) {
        this.developer = developer;
        this.application = application;
        this.version = version;
        this.buildTool = buildTool;
        this.ciTool = ciTool;
        this.container = container;
        this.orchestrator = orchestrator;
        this.status = status;
    }

    public String getDeveloper() { return developer; }
    public String getApplication() { return application; }
    public String getVersion() { return version; }
    public String getBuildTool() { return buildTool; }
    public String getCiTool() { return ciTool; }
    public String getContainer() { return container; }
    public String getOrchestrator() { return orchestrator; }
    public String getStatus() { return status; }
}