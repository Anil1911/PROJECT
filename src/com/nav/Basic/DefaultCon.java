package com.nav.Basic;

public class DefaultCon {
    private  int id;
    private String name;

    DefaultCon(){
        System.out.println("Default constructor");
    }

    public  DefaultCon(int i, String n) {
        id=i;
        name=n;
    }
    void display(){
        System.out.println("Id :"+ id+ " Name :"+name);
    }



    public static void main(String[] args) {
        DefaultCon d=new DefaultCon();
        DefaultCon d1=new DefaultCon(3,"Anil");
        d1.display();
    }

}
