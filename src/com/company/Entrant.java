package com.company;


public class Entrant extends Person{
    private Department department;

    public Entrant(String name) {
        super(name);
    }

    public String getName(){
        return name;
    }

    public void setDepartment(Department department){
        this.department = department;
    }

    public String getDepartmentName(){
        if(department == null){
            return null;
        }
        return department.getName();
    }

}
