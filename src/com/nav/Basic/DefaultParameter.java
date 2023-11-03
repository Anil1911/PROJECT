package com.nav.Basic;

public class DefaultParameter {
    private  int id;
    private String name;

    DefaultParameter(){
        System.out.println("Default constructor");
    }

    public DefaultParameter(int i, String n) {
        id=i;
        name=n;
    }
    void display(){
        System.out.println("Id :"+ id+ " Name :"+name);
    }



    public static void main(String[] args) {
        DefaultParameter defaultParameter=new DefaultParameter();
        DefaultParameter defaultParameter1=new DefaultParameter(3,"Anil");
        defaultParameter1.display();
    }

}
