package com.training.basics;

import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args){
        String num, revnum = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number:");
        num = in.nextLine();
        int length = num.length();
        for ( int i = length - 1; i >= 0; i-- )
            revnum = revnum + num.charAt(i);
        if (num.equals(revnum))
            System.out.println("Given string/number is a palindrome");
        else
            System.out.println("Given string/number is not a palindrome");
    }
}
