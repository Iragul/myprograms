package com.management;

import java.util.Scanner;



public class Home {

  public static void main(String[] args) {
   
   float costprice,sellingprice,profit,loss;
   Scanner in= new Scanner(System.in);
   System.out.println("Enter the cost price :");
   costprice=in.nextFloat();
   System.out.println("Enter the selling price : ");
   sellingprice=in.nextFloat();
   if(sellingprice>=costprice)
   {
       profit=sellingprice - costprice;
       System.out.println("Profit is"+profit);
   }
   else
   {
     loss=costprice - sellingprice;
     System.out.println("Loss is "+loss);
   }
  }
}
