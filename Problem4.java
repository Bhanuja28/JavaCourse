package com.training.basics;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first alphabet:");
        char a = sc.next().charAt(0);
        System.out.println("Enter the second alphabet:");
        char b = sc.next().charAt(0);

        if(a>b){
            System.out.println(b+", "+a);
        }
        else{
            System.out.println(a+", "+b);
        }
    }
}
