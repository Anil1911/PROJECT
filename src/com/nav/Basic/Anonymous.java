package com.nav.Basic;

public class Anonymous {
    // It is simply nameless. An object which has no Reference
    void fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+  n  + "=" + f);

    }

    public static void main(String[] args) {
        new Anonymous().fact(5);
    }





}
