package com.training.basics;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        if(n>0) {
            System.out.println("Number is positive");
        }
        else if (n<0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
