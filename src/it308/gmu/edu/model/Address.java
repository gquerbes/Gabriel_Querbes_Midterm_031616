/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it308.gmu.edu.model;

/**
 *
 * @author gabrielquerbes
 */
public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    
    public Address() {
    }

    
    public String getStreetAddress() {
        return streetAddress;
    }

    public boolean setStreetAddress(String streetAddress) {
        if(streetAddress.length()>1){
            this.streetAddress = streetAddress;
            return true;
        }
        else{
            return false;
        }
    }

    public String getCity() {
        return city;
    }

    public boolean setCity(String city) {
        if(city.length()>1){
          this.city = city;
          return true;  
        }
        else{
            return false;
        }
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public boolean setZip(String zip) {
        if(zip.length()==5){
           this.zip = zip;
           return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Address{" + "streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zip=" + zip + '}';
    }
    
    
    
}
