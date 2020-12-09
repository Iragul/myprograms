package com.management;
import java.util.Scanner;

public class shop {

  public static void main(String[] args) {
   System.out.println("Enter the Quantity of mutton");
   Scanner in=new Scanner(System.in);
   float muttonquantity,muttonprice=700,finalamount,amountpaid,Balance;
   muttonquantity=in.nextFloat();
   
   finalamount=muttonquantity*muttonprice;
    System.out.println("Total price "+finalamount);
    
   System.out.println("Amount paid");
      amountpaid=in.nextFloat();
       Balance = finalamount - amountpaid;
        System.out.println("Your balance is"+ Balance);
        
      
    
   }
  }


