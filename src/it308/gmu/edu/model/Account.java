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
public class Account {
    private int accountNumber;
    private double balance;
    private String accountType;
    private boolean paperless;
    private String pinNumber;
    
    private static int lastAccountNumber = 100;

    public Account(){
        lastAccountNumber++;
        this.accountNumber = lastAccountNumber;
       
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    

    public double getBalance() {
        return balance;
    }

    public boolean setBalance(double balance) {
        if (balance > 0){
            this.balance = balance;
            return true;
        }
        else{
            return false;
        }
        
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isPaperless() {
        return paperless;
    }

    public void setPaperless(boolean paperless) {
        this.paperless = paperless;
    }
    
    public boolean getPaperless(){
        return paperless;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public boolean setPinNumber(String pinNumber) {
        if(pinNumber.length()==4){
            this.pinNumber = pinNumber;
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static int getLastAccountNumber(){
        return lastAccountNumber;
    }
    
    //special purpose methods
    
    public boolean withdraw(double amount){
        if (balance - amount >= 0){
            balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public boolean deposit(double amount){
        if (amount >0){
            balance += amount;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType + ", paperless=" + paperless + ", pinNumber=" + pinNumber + '}';
    }
    
    
    
    
}
