package com.management;

import java.util.Scanner;


public class passfail {

  public static void main(String[] args) {
     int Markscored,passmark=40;
     Scanner in= new Scanner(System.in);
     System.out.println("Enter the mark scored by student");
     Markscored=in.nextInt();
     if(Markscored>=passmark)
     {
       System.out.println("student is passed");
       
     }
     else
     {
       System.out.println("student failed in exam");
     }
  }

}
