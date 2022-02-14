package org.la.core.java.student.wang.assignment8;

public class Company {
    /*
    1.	Create a class Company having member variables companyId, name, description.
    create getters and setters for all member variables.
    Create object of Company class in other class inside main method and set all member values and
    print all member values using getters.
     */
    private int companyID;
    private String name, description;

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
