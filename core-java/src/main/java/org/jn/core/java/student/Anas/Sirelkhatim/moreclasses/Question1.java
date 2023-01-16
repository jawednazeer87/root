package org.jn.core.java.student.anas.sirelkhatim.moreclasses;


class Company
{
    private int companyID;
    private String name;
    private String description;
    
    Company(int companyID, String name, String description)
    {
        this.companyID = companyID;
        this.name = name;
        this.description = description;   
    }
    
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

public class Question1 {

    public static void main(String[] args) {
        
    Company c1 = new Company(21314,"Cool", "Good Company");
    
    System.out.println(c1.getCompanyID());
;
    }

}
