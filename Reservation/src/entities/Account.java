package entities;

import exceptions.DomainExceptions;

public class Account {
    private Integer accNumber;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer accNumber, String name, Double balance, Double withdrawLimit) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public Integer getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getBalance() {
        return balance;
    }
    public Double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws DomainExceptions{
        if(withdrawLimit<amount){
            throw new DomainExceptions("The amount inserted passed the withdraw limit.");
        }
        if(balance<amount) {
            throw new DomainExceptions("Not enough balance to withdraw.");
        }
        this.balance-= amount;
    }
}
