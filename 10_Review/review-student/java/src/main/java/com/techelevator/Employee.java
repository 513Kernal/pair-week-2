package com.techelevator;

public class Employee {
    private long employeeID;
    private String firstName;
    private String lastName;
    private String email;
    private double salary;
    private Department department;
    private String hireDate;

    private static final double STARTING_SALARY = 60000;

    public long getEmployeeID(){
        return this.employeeID;
    }



    //getter

    public void setEmployeeID(long employeeID){
        this.employeeID = employeeID;
    }
    //setter

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public Department getDepartment(){
        return this.department;
    }

    public void setDepartment(Department department){
        this.department = department;
    }

    public String getHireDate(){
        return this.hireDate;
    }

    public void setHireDate(String hireDate){
        this.hireDate = hireDate;
    }
    //end of getters/setters




    //Constructors

    public Employee(long employeeID, String firstName, String lastName, String email,
                    Department department, String hireDate) {
        setEmployeeID(employeeID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setDepartment(department);
        setHireDate(hireDate);
        this.salary = STARTING_SALARY;
    }

        //second constructor
    public Employee(){
        this.salary = STARTING_SALARY;
    }


        //****METHODS****

        //getfullname
    public String getFullName(){
        return lastName + ", " + firstName;
    }

    public void raiseSalary(double percent){
        salary += salary * (percent/100);
    }




        //getfirstname+getlastname=getfullname
        //raisesalary

    }








