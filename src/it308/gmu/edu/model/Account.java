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
    private char accountType; //"C" : Checking , "S" : Savings, "I" : Investment 
    private boolean paperless;
    private String pinNumber;
    
    private static int lastAccountNumber = 100;

    public Account(){
        this.accountNumber = lastAccountNumber;
        lastAccountNumber++;
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

    public char getAccountType() {
        return accountType;
    }

    public void setAccountType(char accountType) {
        if(accountType == 'C' || accountType == 'S' || accountType == 'I'){
            this.accountType = accountType;
        }
        else{ 
            this.accountType = 'X';
        }
    }

    public boolean isPaperless() {
        return paperless;
    }

    public void setPaperless(boolean paperless) {
        this.paperless = paperless;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
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
    
    
}
