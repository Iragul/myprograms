package com.management;

import java.util.Scanner;


public class checkelderbrother {

  public static void main(String[] args) {
   System.out.println("To check which brother is elder");
   int firstbrotherage,secondbrotherage;
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the first brother age");
   firstbrotherage=in.nextInt();
   System.out.println("Enter the second brother age");
   secondbrotherage=in.nextInt();
   if(firstbrotherage>secondbrotherage)
   {
     System.out.println("First brother is the elder brother");
   }
   else
   {
     System.out.println("Second brother is the elder brother");
   }
  }

}
