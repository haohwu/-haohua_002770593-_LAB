/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author whh
 */
public class Person() {
    private String name;
    private Long nuid;
    Address address;
    ContactInfor personalcContactInfor;
    ContactInfor officeContactInfor;
    
    public Person{
        this.name = "";
        this.nuid = "";
        this.address = new Address();
        this.personalcContactInfor = new ContactInfor();
        this.officeContactInfor = new ContactInfor();
    }

    public String gerName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Integer getNuid(){
        return nuid;
    }
    
    public void setNuid(Long nuid){
        this.nuid = nuid;
    }
    
    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }
    
    public void getPersonalContactInfor(){
        return personalcContactInfor;
    }
    
    public void setPersonalContactInfor(ContactInfor personalContactInfor){
        this.personalcContactInfor = personalcContactInfor;
    }
    
    public void getOfficeContactInfor(){
        return officeContactInfor;
    }
    
    public void setOfficeContactInfor(ContactInfor officeContactInfor){
        this.officeContactInfor = officeContactInfor;
    }
    
}