package com.nav.Basic;

public class ObjectUseMethodEx {
    int id;
    String name;

    void met(int i,String n){
        id=i;
        name=n;
    }
    void show(){
        System.out.println(id +" " + name);
    }

    public static void main(String[] args) {
        ObjectUseMethodEx ob=new ObjectUseMethodEx();
        ob.id=1;
        ob.name="Anil";
       // ob.met(3,"Arjun");
        ob.show();
    }



}
