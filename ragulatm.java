package atm;
import java.util.Scanner;


class ragulatm {
  
  public static void main(String[] args) {
     
    System.out.println("Welcome to ragulatm");
    System.out.println("1.DEPOSIT");
    System.out.println("2.WITHDRAWAL");
    System.out.println("3.BALANCE");
    System.out.println("4.EXIT");
    int choose;
      balance b=new balance();
    Scanner sc=new Scanner(System.in);
    choose=sc.nextInt();
    switch(choose)
    {
      case 1:
          b.deposit();
          break;
      case 2:
          b.withdrawal();
          break;
          
      case 3:
        b.balance1();
        break;
      case 4:
        b.exit();
        break;
        
        }
    
  }
}

class balance{
   Scanner scs=new Scanner(System.in);
   Scanner option=new Scanner(System.in);
   Scanner choose=new Scanner(System.in);
  int balanceamt;
  int depositamt;
  int withdrawalamt;
  int options;
  int choose1;
  void balance1(){
  
     System.out.println("Your account balance "+balanceamt);
   
      System.out.println("1.BALANCE");
      System.out.println("2.WITHDRAWAL");
      System.out.println("3.DEPOSIT");
      System.out.println("4.EXIT");
      choose1=choose.nextInt();
      
      switch(choose1)
      {
        case 1:
          balance1();
          break;
        case 2:
          withdrawal();
          break;
        case 3:
          deposit();
          break;
        case 4:
            exit();
          break;
        default:
          System.out.println("Enter correct option");

         
      }
 
  }
  void deposit(){
    
    System.out.println("Enter the amount want to deposit:");
    depositamt=scs.nextInt();
    balanceamt=balanceamt+depositamt;
     System.out.println("1.BALANCE");
      System.out.println("2.WITHDRAWAL");
      System.out.println("3.DEPOSIT");
    System.out.println("4.EXIT");
      choose1=choose.nextInt();
      
      switch(choose1)
      {
        case 1:
          balance1();
          break;
        case 2:
          withdrawal();
          break;
          case 3:
          deposit();
          break;
          case 4:
            exit();
          break;
        default:
          System.out.println("Enter correct option");
      }
   
   
  }
  void withdrawal(){
     System.out.println("Enter the amount want to withdrawal:");
    withdrawalamt=scs.nextInt();
    if(balanceamt<withdrawalamt)
    {
      System.out.println("Insufficent balance");
      System.out.println("Your account balance "+balanceamt);
      
      
      
      System.out.println("1.BALANCE");
      System.out.println("2.WITHDRAWAL");
      System.out.println("3.DEPOSIT");
      System.out.println("4.EXIT");
      choose1=choose.nextInt();
      
      switch(choose1)
      {
        case 1:
          balance1();
          break;
        case 2:
          withdrawal();
          break;
          case 3:
          deposit();
          break;
          case 4:
            exit();
          break;
        default:
          System.out.println("Enter correct option");
      }
    
    }
    else
    {
      balanceamt=balanceamt-withdrawalamt;
      System.out.println("You have withdrawed "+withdrawalamt+"from your account");
      System.out.println("Your account balance "+balanceamt);
      
      
      System.out.println("1.BALANCE");
      System.out.println("2.WITHDRAWAL");
      System.out.println("3.DEPOSIT");
      System.out.println("4.EXIT");
      choose1=choose.nextInt();
      
      switch(choose1)
      {
        case 1:
          balance1();
          break;
        case 2:
          withdrawal();
          break;
          case 3:
          deposit();
          break;
          case 4:
            exit();
          break;
        default:
          System.out.println("Enter correct option");
      }
    }
   
   
  }
  void exit(){
    System.out.println("Thanks for using ragul atm");
    
  }
}
