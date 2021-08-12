package com.training.basics;

public class Problem13 {
    public static void main (String[] args)
    {
        int i;
        int num;
        //Empty String
        String  primeNumbers = "";

        for (i = 10; i <= 99; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 10 to 99 are :");
        System.out.println(primeNumbers);
    }
}

