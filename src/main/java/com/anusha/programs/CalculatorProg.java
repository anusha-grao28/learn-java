package com.anusha.programs;

import java.util.Scanner;

public class CalculatorProg {
    public static void main(String[] args){
        Integer a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter two values:\n");
        a=sc.nextInt();
        b=sc.nextInt();
        Integer result=a+b;
        System.out.println("Sum of Integers is: "+result);
    }
}
