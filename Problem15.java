package com.training.basics;

import java.util.Scanner;

public class Problem15 {
    public static void  main(String[] args){
        long n,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextLong();
        for(sum = 0; n!=0; n/=10){
            sum = sum + n % 10;
        }
        System.out.println("Sum of the digits of given number is: "+sum);
    }
}
