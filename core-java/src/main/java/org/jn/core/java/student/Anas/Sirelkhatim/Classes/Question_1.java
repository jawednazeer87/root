package org.jn.core.java.student.Anas.Sirelkhatim.Classes;

class Company
{
    private int companyid;
    private String companyname;
    private String description;
    
    public int getCompanyID()
    {
        return companyid;
    }
    
    public String getcompanyname()
    {
        return companyname;
    }
    
    public String getdescription()
    {
        return description;
    }
    
    public void setCompanyID(int companyid)
    {
        this.companyid = companyid;
    }
    
    public void setcompanyname(String companyname)
    {
        this.companyname = companyname;
    }
    
    public void setdescription(String description)
    {
        this.description = description;
    }
}

public class Question_1 {
    public static void main(String[] args) {
        
        Company c1 = new Company();
        c1.setCompanyID(3123124);
        c1.setcompanyname("AnasCompany");
        c1.setdescription("this is my company hahaha");
        
        System.out.println(c1.getCompanyID());
        System.out.println(c1.getdescription());
        System.out.println(c1.getcompanyname());
        
        
        
        

    }
}
