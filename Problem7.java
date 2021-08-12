package com.training.basics;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the character:");
        char a = sc.next().charAt(0);
        char b;
        if(Character.isLowerCase(a)){
            b = Character.toUpperCase(a);
        }
        else
            b = Character.toLowerCase(a);
        System.out.println(a+"->"+b);
    }
}
