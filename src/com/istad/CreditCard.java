package com.istad;

import java.time.LocalDate;

public class CreditCard extends Account {
    private static Account account;
    private Integer pinn;
    private Double limitAmount;
    private Double balance;
    private LocalDate invalidAccount;
    public CreditCard(){

    }

    public CreditCard(String name, Double balace, String accountType) {
        super( name, balace, accountType);
    }

    public Integer getPinn() {
        return pinn;
    }

    public void setPinn(Integer pinn) {
        this.pinn = pinn;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public Double getBalance() {
        return balance;
    }

    private void setBalance(Double balance) {
        this.balance = balance;
    }

    public LocalDate getInvalidAccount() {
        return invalidAccount;
    }

    public void setInvalidAccount(LocalDate invalidAccount) {
        this.invalidAccount = invalidAccount;
    }

    public void deposit(Double amount){
            LocalDate now=LocalDate.now();
        if(now.isAfter(invalidAccount)){

            System.out.println("Card is Exspire");
            return;
        }
        super.deposit(amount);
    }
    private boolean isExspired(LocalDate date){
        LocalDate now=LocalDate.now();
        return now.isAfter(date);
    }
    public void showBalance(){
        System.out.println("Pin "+pinn);
        System.out.println("Limite "+limitAmount);

        System.out.println("==============");
    }
}
