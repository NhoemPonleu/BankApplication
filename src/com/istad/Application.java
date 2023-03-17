package com.istad;

import Database.Database;

public class Application {
    public static void main(String[] args) {
       CreditCard cer=new CreditCard();
         cer.setPinn(129);
       if(Database.creditCard().getPinn().equals(cer.getPinn()) ){
          cer=Database.creditCard();
       }else {
           System.out.println("Wrong ");
           return;
       }
        cer.deposit(2000.0);
        cer.showBalance();
        cer.showAmount();
    }
}
