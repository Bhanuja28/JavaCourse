package com.training.basics;

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args){
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        for(int i=2; i <=2; i++ ){
            temp = num%i;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Given number is a prime number");
        }
        else
            System.out.println("Given number is not a prime number");
    }
}
