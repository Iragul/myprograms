package com.management;

import com.management.function;
import java.util.Scanner;


public class function {
     public  void mutton(){
       function obj = new function();
       System.out.println("Enter the Quantity of Mutton");
       float muttonqty;
       float muttonkilo=700,muttonfinal;
       float amountpaid,mBalance;
       Scanner in = new Scanner(System.in);
       muttonqty =in.nextFloat();
       System.out.println("Total price for mutton");
       muttonfinal=muttonqty*muttonkilo;
       System.out.println(muttonfinal);
       System.out.println("How much paid");
       amountpaid =in.nextFloat();
       if(muttonfinal==amountpaid)
       {
         System.out.println("You paid full amount ");
         
       }
       else
       {
         mBalance = muttonfinal-amountpaid;
         System.out.println("Your mutton amount balance is " + mBalance);
       }
       System.out.println("Do you need Chiken or country chiken"); 
       System.out.println("1.Yes"); 
       System.out.println("2.No"); 
       
       int choice1;
       choice1=in.nextInt(); 
       if(choice1 == 1)
       {
         obj.options(); 
         
       }
       else if(choice1 == 2) 
       {
         
         System.out.println("Thanks for shopping with us");
         
         
       }
       else
       {
         System.out.println("Enter your correct choice");
       }
       
     }
 //**************************************//
    
    public void bchiken(){
  
           function obj = new function();
       System.out.println("Enter the Quantity of Broiler");
       float bchikenqty;
       float bchikenkilo=180,bchikenfinal;
       float bamountpaid,bbalance;
       Scanner in = new Scanner(System.in);
       bchikenqty =in.nextFloat();
       System.out.println("Total price for mutton");
       bchikenfinal=bchikenqty*bchikenkilo;
       System.out.println(bchikenfinal);
       System.out.println("How much paid");
       bamountpaid =in.nextFloat();
       if(bchikenfinal==bamountpaid)
       {
         System.out.println("You paid full amount ");
         
       }
       else
       {
         bbalance = bchikenfinal-bamountpaid;
         System.out.println("Your  amount balance is " + bbalance);

   
       }
       
       System.out.println("Do you need mutton or country chiken");
       System.out.println("1.Yes");
       System.out.println("2.No");
       
       int choice1;
       choice1=in.nextInt();
       if(choice1 == 1)
       {
         obj.options();
         
       }
       else if(choice1 == 2)
       {
         
         System.out.println("Thanks for shopping with us");
         
       }
       else
       {
         System.out.println("Enter your correct choice");
       }
     }
     
 //*************************************
     public  void countrychiken(){
     
     function obj = new function();
       System.out.println("Enter the Quantity of country chiken");
       float cchikenqty;
       float cchikenkilo=550,cchikenfinal;
       float camountpaid,cBalance;
       Scanner in = new Scanner(System.in);
       cchikenqty =in.nextFloat();
       System.out.println("Total price for country chiken");
       cchikenfinal= cchikenqty*cchikenkilo;
       System.out.println(cchikenfinal);
       System.out.println("How much paid");
       camountpaid =in.nextFloat();
       if(cchikenfinal==camountpaid)
       {
         System.out.println("You paid full amount ");
         
       }
       else
       {
         cBalance = cchikenfinal-camountpaid;
         System.out.println("Your  amount balance is " + cBalance);

   
       }
       
       if(cchikenfinal == camountpaid)
       {
         System.out.println("Full amount paid");
         cBalance=0;
       }
       else
       {
         cBalance = cchikenfinal - camountpaid;
         System.out.println("Your balance amount is ");
         
         System.out.println(cBalance);
       }
       System.out.println("Do you need Chiken or country chiken");
       System.out.println("1.Yes");
       System.out.println("2.No");
       
       int choice1;
       choice1=in.nextInt();
       if(choice1 == 1)
       {
         obj.options();
         
       }
       else if(choice1 == 2)
       {
         
         System.out.println("Thanks for shopping with us");
         
       }
       else
       {
         System.out.println("Enter your correct choice");
       }
       
     }
 //***************************************    
     
     public void options(){
        
    System.out.println("Type of flesh you need");
    System.out.println("1.mutton");
    System.out.println("2.Broiler chiken");
    System.out.println("3.country chiken");
      function obj = new function();
      int choice;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter your choice");
    choice=in.nextInt();
    switch(choice)
    {
      case 1:
        obj.mutton(); 
        break;
      case 2:
        obj.bchiken(); 
        break;
      case 3:
        obj.countrychiken(); 
        
        break;
        
      default :
         System.out.println("Enter correct choice");
         obj.options();
        
    }
   
  }

//****************************************

  public static   void main(String[] args) {
    function obj = new function();
    obj.options(); 
    }
    }