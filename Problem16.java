package com.training.basics;

import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter an integer number:");
        int rowCount = sc.nextInt();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
