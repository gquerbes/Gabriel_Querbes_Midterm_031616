/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it308.gmu.edu.model;

import java.util.LinkedList;

/**
 *
 * @author gabrielquerbes
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String ssn;
    
    private LinkedList <Account> account = new LinkedList<>(); //allow multiple entries
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
        return account.getFirst();
    }

    public void setAccount(Account account) {
        this.account.add(account);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", account=" + account + ", address=" + address + '}';
    }
    
    
    
    
}
