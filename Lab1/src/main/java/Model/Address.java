/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author whh
 */
public class Address {
    String street;
    Integer apt;
    String city;
    String state;
    Integer zipcode;
    
    public Address(){
        this.street = "";
        this.apt = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(String street) {
        this.street = street;       
    }
    public Integer getApt(){
        return apt;
    }
    public void setApt(Integer apt){
        this.apt = apt;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state = state;
    }
    public Interger setZipCode(){
        return zipcode;
    }
    public void setZipCode(Integer zipcode){
        this.zipcode = zipcode;
    }
    
}
