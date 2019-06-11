package com.practice.objnestexample;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Projects {

    @Id
    private long id;

    private String projectName;
    private String projectOwner;

    public Projects(){
    }

    public Projects(long id, String projectName, String projectOwner){
        this.id=id;
        this.projectName = projectOwner;
        this.projectOwner = projectOwner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectOwner='" + projectOwner + '\'' +
                '}';
    }
}
