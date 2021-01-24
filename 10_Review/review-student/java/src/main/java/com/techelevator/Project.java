package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private String description;
    private String startDate;
    private String dueDate;
    List<Employee> teamMembers = new ArrayList<>();

    //name
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //description
    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    //startDate
    public String getStartDate(){
        return this.startDate;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    //dueDate
    public String getDueDate(){
        return this.dueDate;
    }

    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }

    //List of Employees getter setter

    public List<Employee> getTeamMembers(){
     return this.teamMembers;
    }

    public void setTeamMembers(Employee teamMember){
        this.teamMembers.add(teamMember);
    }


// mon dieu









    public Project (String name, String description,
                    String startDate, String dueDate){
        setName(name);
        setDescription(description);
        setStartDate(startDate);
        setDueDate(dueDate);
    }




}
