package org.la.core.java.student.datatype.wang.assignment8;

import java.time.LocalDate;

public class Employee {
    /*
    6.	Create a class Employee having member variables id, employeeName, employeeNum, dateHired, cityId. create getters and setters for all member variables. Create object of Employee class in other class inside main method and set all member values and print all member values using getters.
     */
    private int id,employeeNum,cityId;
    private String employeeName;
    private LocalDate dateHired;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }
}
