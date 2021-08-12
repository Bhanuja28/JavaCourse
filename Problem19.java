package com.training.basics;

public class Problem19 {
    public static void main(String[] args) {
        int num = 0;
        int i = 0;
        while (num != 5) {
            i++;
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                num++;
            }
        }
    }
}
