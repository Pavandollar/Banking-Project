package Com;

import java.util.Scanner;

public class solution 
{
    public static void main(String[] args) {
		
	Bank b = new Bankimpl(10000);
    Scanner sc = new Scanner(System.in);
    while(true)
    {

System.out.println("1.Deposit Amount \n2:whithdraw\n3:Checkbal");
System.out.println("4.Exit\nEnter choice");

int choice = sc.nextInt();

switch(choice)
{
case 1 : System.out.println("enter amount to be deposted");
        int  amtdeposit = sc.nextInt();
        b.deposit(amtdeposit);//b.deposit(sc.nextInt());
        break;
        
case 2: System.out.println("enter amount to be withdrawn");
        int amtwithdraw = sc.nextInt();
        b.withdraw(amtwithdraw);
        break;

case 3: System.out.println("Available Balance Rs."+b.checkbal());
        break;
        
case 4: System.out.println("thank you visit again");
System.exit(0);

default : System.out.println("invalid choice");
     }
  sc.close();
  
    }
}
}