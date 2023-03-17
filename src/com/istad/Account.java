package com.istad;

 abstract class Account {
    private String name;
    private Double balace;
    private String accountType;
  public Account(){

  }
    public Account( String name, Double balace, String accountType) {

        this.name = name;
        this.balace = balace;
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalace() {
        return balace;
    }

    private void setBalace(Double balace) {
        this.balace = balace;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public  void deposit(Double amount){
        if(amount>0){
            balace+=amount;
            System.out.println("You Can Deposit:");
        }
        if(amount==0){
            System.out.println("Cannot ");
        }else {
            System.out.println("Please Try Again");
        }
    }
    public void showAmount(){
        System.out.println("Amount Balance:"+balace);
    }
}
