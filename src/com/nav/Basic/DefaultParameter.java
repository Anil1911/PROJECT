package com.nav.Basic;
//
//public class DefaultParameter {
//    private  int id;
//    private String name;
//
//    DefaultParameter(){
//        System.out.println("Default constructor");
//    }
//
//    public DefaultParameter(int i, String n) {
//        id=i;
//        name=n;
//    }
//    void display(){
//        System.out.println("Id :"+ id+ " Name :"+name);
//    }
//
//
//
//    public static void main(String[] args) {
//        DefaultParameter defaultParameter=new DefaultParameter();
//        DefaultParameter defaultParameter1=new DefaultParameter(3,"Anil");
//        defaultParameter1.display();
//    }
//
//}

class MyClass {
    private int number;

    // Constructor with a parameter
    public MyClass(int num) {
        number = num;
        System.out.println("Object created with number: " + number);
    }

    public int getNumber() {
        return number;
    }
}

public class DefaultParameter {
    public static void main(String[] args) {
        // Creating an object using the constructor and storing the reference in a variable
        MyClass myObject = new MyClass(42);

        // Accessing the object's state using methods
        int objectNumber = myObject.getNumber();
        System.out.println("Number retrieved from the object: " + objectNumber);
    }
}


