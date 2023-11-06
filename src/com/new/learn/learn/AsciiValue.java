
/*
Write a program to print ASCII value corresponding to the given input value.


Input and Output Format:

Refer Sample Input and Output for formatting specifications. Assume that the input values will be any one of the values ranges from A to Z, or , a to z, or 0 to 9.


Sample Input and Output 1:

[All text in bold corresponds to input and the rest corresponds to output]


Enter the input value

P

80


Sample Input and Output 2:

[All text in bold corresponds to input and the rest corresponds to output]

Enter the input value

p

112
*/
package com.nav.New.learn;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter input value :");

        char c=s.next().charAt(0);
        int C=c;
        System.out.println(C);

    }




}
