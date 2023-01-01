package org.jn.core.java.student.Anas.Sirelkhatim.Classes;

class Attendee
{
    private int attendeeID;
    private String firstname;
    private String lastname;
    private int phone;
    private String email;
    private boolean vip;
    
    public int getAttendeeID() {
        return attendeeID;
    }
    public void setAttendeeID(int attendeeID) {
        this.attendeeID = attendeeID;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    
    
    
}

public class Question_4 {

    public static void main(String[] args) {
       
        Attendee a1 = new Attendee();
        
        a1.setAttendeeID(0);
        a1.setEmail(null);
        a1.setFirstname(null);
        a1.setLastname(null);
        a1.setPhone(0);
        a1.setPhone(0);
        a1.setVip(false);
        
        System.out.println(a1.getAttendeeID());
        System.out.println(a1.getEmail());
        System.out.println(a1.getFirstname());
        System.out.println(a1.getLastname());
        System.out.println(a1.getPhone());
        System.out.println(a1.getEmail());

    }

}
