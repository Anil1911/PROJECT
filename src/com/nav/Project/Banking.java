package com.nav.Project;

public class Banking {
    private int account_no;
    private String name;
    private float amount;

    void details(int an, String n,float a){
        account_no=an;
        name=n;
        amount=a;
    }
    void deposit(float money){
        amount=amount+money;
        System.out.println(amount+" Successfully Deposited");
    }
    void withdraw(float money) {
        if (amount < money) {
            System.out.println("Insufficient Fund");
        }
        else {
            amount = amount - money;
            System.out.println( amount+" Successfully withdrawal");
        }

    }
    void checkBalance(){
        System.out.println("Balance : "+amount);
    }
    void show(){
        System.out.println("Account_no ="+ account_no+" Name "+ name + " Amount"+ amount);
    }

    public static void main(String[] args) {
        Banking b=new Banking();
        b.details(1456,"Anil",300);
        b.show();
        b.checkBalance();
        b.deposit(2000);
        b.withdraw(200);
        b.checkBalance();
    }






}
