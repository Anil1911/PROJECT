package com.nav.Basic;

public class UseConstructor {
    private int id;
    private String name;

    public UseConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void met(){
        System.out.println(id+" "+ name);
    }

    public static void main(String[] args) {
        UseConstructor u=new UseConstructor(1,"Anil");
        u.met();
        System.out.println(u.hashCode());


    }



}
