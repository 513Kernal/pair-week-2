package com.techelevator;

public class Department {

    private int departmentID;
    private String name;

    public int getDepartmentID(){
        return this.departmentID;  //no other departmentID, but .this is to help remember logic
    }
    public void setDepartmentID(int departmentID){
        this.departmentID = departmentID;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Department(int departmentID, String name){
        setDepartmentID(departmentID);
        setName(name);
    }

}
