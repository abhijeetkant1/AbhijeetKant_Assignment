package com.cg.assignment;
import java.util.Scanner;

public class Q1simple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Principle, rate and time: ");
        int p=s.nextInt();
        int r=s.nextInt();
        int t= s.nextInt();
        Calculate simple_interest = (a,b,c) -> System.out.println("The simple interest: ₹"+ (a*b*c)*0.01);
        simple_interest.give(p,r,t);
    }
}
interface Calculate{
    public void give(int p,int r,int t);
}
