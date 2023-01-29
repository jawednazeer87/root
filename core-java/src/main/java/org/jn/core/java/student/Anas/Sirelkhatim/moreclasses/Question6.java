package org.jn.core.java.student.anas.sirelkhatim.moreclasses;

import java.time.LocalTime;

class Employee
{
    private int id;
    private String employeename;
    private int employeenum;
    private LocalTime datehired  = LocalTime.now();
    private int cityid;
    
    
    
    public Employee(int id, String employeename, int employeenum, LocalTime datehired, int cityid) {
        super();
        this.id = id;
        this.employeename = employeename;
        this.employeenum = employeenum;
        this.datehired = datehired;
        this.cityid = cityid;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmployeename() {
        return employeename;
    }
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
    public int getEmployeenum() {
        return employeenum;
    }
    public void setEmployeenum(int employeenum) {
        this.employeenum = employeenum;
    }
    public LocalTime getDatehired() {
        return datehired;
    }
    public void setDatehired(LocalTime datehired) {
        this.datehired = datehired;
    }
    public int getCityid() {
        return cityid;
    }
    public void setCityid(int cityid) {
        this.cityid = cityid;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", employeename=" + employeename + ", employeenum=" + employeenum + ", datehired="
                + datehired + ", cityid=" + cityid + "]";
    }
    
    
    
}

public class Question6 {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println();

    }

}
