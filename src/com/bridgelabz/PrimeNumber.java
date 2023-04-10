package com.bridgelabz;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[])
    {
        int num,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        num = sc.nextInt();
                b=1;
        c=0;
        while(b<=num)
        {
            if((num%b)==0)
                c=c+1;
            b++;
        }
        if((c==2))
            System.out.println(num +" is a Prime Number");
        else
            System.out.println(num +" isnot a Prime Number");
    }
}
