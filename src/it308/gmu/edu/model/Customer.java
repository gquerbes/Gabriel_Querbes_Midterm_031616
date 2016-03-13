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
public class Customer {
    private String firstName;
    private String lastName;
    private String ssn;
    
    private Account account; //allow multiple entries
    private Address address;

    
    
    public Customer() {
        
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean setFirstName(String firstName) {
        if(firstName.length() > 1){
           this.firstName = firstName; 
           return true;
        }
        else{
            return false;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public boolean setLastName(String lastName) {
        if(lastName.length() > 1){
           this.lastName = lastName; 
           return true;
        }
        else{
            return false;
        }
        
    }

    public String getSsn() {
        return ssn;
    }

    public boolean setSsn(String ssn) {
        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        if(ssn.matches(regex)){
            this.ssn = ssn;
            return true;
        }
        else{
            return false;
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    
    
}
