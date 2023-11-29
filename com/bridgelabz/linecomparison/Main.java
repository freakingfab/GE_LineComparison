package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input for Line 1");
        System.out.print("Enter x1, y1: ");
        int x1l1 = input.nextInt(), y1l1= input.nextInt();

        System.out.println("Input for Line 1");
        System.out.print("Enter x2, y2: ");
        int x2l1 = input.nextInt(), y2l1= input.nextInt();

        LineComparison line1= new LineComparison(x1l1,y1l1,x2l1, y2l1);

        System.out.println("Input for Line 2");
        System.out.print("Enter x1, y1: ");
        int x1l2 = input.nextInt(), y1l2= input.nextInt();

        System.out.println("Input for Line 2");
        System.out.print("Enter x2, y2: ");
        int x2l2 = input.nextInt(), y2l2= input.nextInt();

        LineComparison line2= new LineComparison(x1l2,y1l2,x2l2, y2l2);

        int val= line1.compareTo(line2);

        if(val==0){
            System.out.println("Both Lines are equal");
        }
        else if(val==1){
            System.out.println("Line 1 is greater");
        }
        else{
            System.out.print("Line 2 is greater");
        }
    }
}
