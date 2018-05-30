/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

import java.util.Scanner;

/**
 *
 * @author Inspi
 */


class BankDemo{
     
    /**
     * @param i
     * @param custno
     * @param redcust
     */
     int i, custno, readcust;
     /**
      * @param amt
      * @param damt
      * @param wamt
      */
     double amt, damt, wamt;
     /**
      * 
      */
     Scanner s = new Scanner( System.in);
     /**
      * This method will open account for the customer after asking for the money to b entered in the account
      * @return successful creation of account along with the money with which the account is created with 
      */
     int open_acct()
     {   
         for(i=0; i<10; i++ ){
         custno=i+1;    
         System.out.println("Customer no."+ (i+1));
         System.out.println(" Enter the amount: ");
         amt = s.nextDouble();
         
         if( amt >= 500)
             System.out.println(" Account successfully created with "+amt+" balance");
         else
             System.out.println(" Account cannot be created beacause "+amt+" is less than 500");
     }
         return custno;
     }     
     
     /**
      * This method will deposit money into the users account after asking for the money to be deposited and on 
      * successful completion of deposition of money will display a message that money is successfully deposited. 
      */
     void Deposit()
     {
         
       
         System.out.println(" Enter the amount to deposit: ");
         damt = s.nextDouble();
         amt += damt;
         System.out.println(damt+" successfully deposited");
             
     }
     
     /**
      * The method will reduce the amount of money withdrawn from the account by the user by subtracting the amount 
      * from available balance.Depending on the  
      */
     void Withdraw()
     {
         
         System.out.println(" Enter the amount to withdraw: ");
         wamt = s.nextDouble();
         
         if( wamt > amt)
             System.out.println(" Insufficient Funds  ");
         else
             if( (amt - wamt) < 500)
                 System.out.println(" Withdrawal is not possible because "+(amt - wamt)+" is less than 500");
             else
                 amt -= wamt;
             }
     /**
      * The method will return the amount of balance available in the account after asking for the account number from the user. 
      */
     void Balance()
     {
         System.out.println(" Balance is: "+amt);
     }
 }
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner( System.in);
        BankDemo d = new BankDemo();
        
        int i, choice, cno=0, custno;
        boolean flag = false;
        
        for(; ;)
        {
            System.out.println(" 1.Open Account \n 2.Deposit cash \n 3.Withdarw cash 4.Balance Enquiry\n ");
            System.out.println(" Enter your choice: ");
            choice = s.nextInt();
            
            if( (choice == 1) && (flag == true))
                System.out.println(" Account is already created ");
            else
                switch( choice )
                {
                    case 1: flag = true;
                            cno=d.open_acct();
                            break;
                            
                    case 2: System.out.println("Enter the customer no: ");
                            custno = s.nextInt();
                            for(i=0; i<10; i++)
                            if(cno == custno){
                        
                               d.Deposit();
                                }
                            break;
                            
                    case 3: System.out.println("Enter the customer no: ");
                            custno = s.nextInt(0);
                            for(i=0; i<10; i++)
                            if(cno == custno){
                        
                            d.Withdraw();
                            }
                            break;
                            
                    case 4: System.out.println("Enter the customer no: ");
                            custno = s.nextInt(0);
                            for(i=0; i<10; i++)
                            if(cno == custno){
                        
                            d.Balance();
                            }
                            break;
                            
                    default : System.out.println(" Invalid choice entered ");
                    
                }
        }
    }
    
}
    

