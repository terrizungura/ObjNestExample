package com.practice.objnestexample;

import io.objectbox.annotation.Entity;

@Entity
public class Report extends Projects{


    private String agentName;
    private String location;

    public Report(){

    }

    public Report(long id, String projectName, String projectOwner, String agentName, String location){
        super(id, projectName, projectOwner);
        this.agentName=agentName;
        this.location=location;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Report{" +
                "agentName='" + agentName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
