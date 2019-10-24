package com.conversation;
import java.util.Scanner;
public class EasyMoney {

 
  public static void main(String[] args) {


double intperY,intperM,intperM2 = 0, PayM,PayM2=0,LoanM, LoanM2 , count=0 ;


   Scanner myProj= new Scanner(System.in);
   System.out.println("Value of your loaned money?");
   LoanM = myProj.nextInt();
       
   System.out.println("What is your interest per year?");         
   intperY = myProj.nextDouble();
       
   System.out.println("How much your payment per month?");
   PayM = myProj.nextDouble();
       
   double IntRate = intperY/100;

   while (LoanM > 0)
   
{

   intperM = IntRate / 12;
   intperM2 = LoanM*intperM;

   PayM2 = PayM - intperM;


   if (PayM < intperM2)
    {
     System.out.println();
      
     System.out.println("The monthly payment is less than the first month's interest "
              + "payment loan amount could not be repaid.");
          System.exit(0);
    }
   else
   { LoanM= LoanM - PayM2 ;
               count++;   
               }
}
      System.out.println();
      System.out.println("How long will it takes to\nrepay the loan? \n\n\""+ count +" months po maam ^_^\"");
  }

}
