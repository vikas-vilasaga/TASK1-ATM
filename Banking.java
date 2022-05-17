import java.util.*;
public class Banking 
{  
    public static void main(String args[] )  
    {  
        int withdraw, deposit,balance = 10000;
        Scanner sc = new Scanner(System.in);  
	String userId="123456",pin="1234";
	System.out.print("Enter your ATM pin: ");
	String inp=sc.nextLine();

	if(inp.equals(pin))
	{
        while(true)  
        {  
            System.out.println(" **ATM INTERFACE**  ");  
            
            System.out.println(" 1.For Check Balance \n 2.For Withdraw \n 3.For Deposit"); 
            System.out.println(" 4.For Tranfer \n 5.For Quit"); 
            System.out.print("Choose the operation you want to Perform:");  
             
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:
                      //displaying the total balance of the user  
                    System.out.println(" Balance : "+balance);  
                    System.out.println("");  
                    break;
                
                case 2:  
                    System.out.print("Enter money to be withdrawn:");   
                     withdraw = sc.nextInt();    
                    if(balance >= withdraw)  
                    {  
                        balance = balance - withdraw;  
                        System.out.println("Please collect your money");  
                    }  
                    else  
                        System.out.println("Insufficient balance");  
                    System.out.println("");  
                    break;  
   
                case 3:  
                      
                    System.out.print("Enter the money to be deposited:");  
                    deposit = sc.nextInt();  
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully Deposited");  
                    System.out.println("");  
                    break;  
   
                case 4:  
                    System.out.println("Account Based Tranfer");                    
                    System.out.print("Enter Amount : ");
                    int amount = sc.nextInt();
                    
                    if(amount > balance)
                        System.out.println("Balance is not sufficient");
                    else {  
                        System.out.println("The amount tranfer successfully");
                        balance = balance - amount;
                      }
                    System.out.println("");
                    break;  
   
                case 5:  
                     
                    System.exit(0);  
       }   }}
else
	System.out.println("invalid PIN");      
    }  
}  



