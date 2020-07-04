package Exception1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.TreeSet;


import java.time.format.DateTimeFormatter;

import java.time.LocalDate;

import java.time.Period;

 

 

public class Transaction {

       ArrayList<Account> accDetails;

       Scanner sc;
    int transaction_number=0;
   	String fromAccount;
   	String toAccount;
   	double amount;
   	String type="";
   	String status="";

       double amt;

       Transaction(){

              sc = new Scanner(System.in);

              accDetails = new ArrayList<Account>();

       }
       public void validateType(String type2) {
   		// TODO Auto-generated method stub
   		if(type2.equalsIgnoreCase("Cash") || type2.equalsIgnoreCase("Transfer"))
   		{
   			
   		}
   		else
   		{
   			System.out.println("Type should be either cash or transfer");
   		}
   	}
       
       Account findAccount(String fromAccount2) {

           

           for(Account obj:accDetails){

                  if(obj.getAccountNumber() == fromAccount2)

                        return obj;

           }

           System.out.println("Account does not exist");

           return null;

    }
       
void transact() throws IOException, TranscationException {
	
       String userChoice;
    	   Account acc= new Account();
   		System.out.println("Enter from account");
   		fromAccount = sc.nextLine();
   		System.out.println("Enter to account");
   		toAccount = sc.nextLine();
   		System.out.println("Enter amount");
   		amount = sc.nextDouble();
   		sc.nextLine();
   		System.out.println("Enter type");
   		type = sc.nextLine();
   		validateType(type);
   		do {
              System.out.println("Please select a number \r\n" +

                                  "1) Do transaction\r\n" +

                                  "2) Print Account Details\r\n" +

                                  "3) Print Transactions detils\r\n"
                                   );
              					
              userChoice = sc.nextLine();
              if(userChoice.equalsIgnoreCase("1"))
              {
            	  if(type.equalsIgnoreCase("cash"))
            	  {
              Account obj = findAccount(fromAccount);
              if(obj!= null) {
                  double balance1;
                  balance1= obj.getBalance()+amount;
                  obj.setBalance(balance1);
            	  
              }
       }
            	  else if(type.equalsIgnoreCase("transfer"))
            	  {
            		  Account obj = findAccount(fromAccount);
            		  Account obj1= findAccount(fromAccount2);
                      if(obj!= null) {
                          double balance1;
                          balance1= obj.getBalance()+amount;
                          obj.setBalance(balance1);
            	  }
              }
   		}
       while( userChoice.equalsIgnoreCase("yes"));
}

       void populateAccounts(String accountNumber, String name, String password, String phone, double balance)

       {

              Account acc= new Account();

             acc.setAccountNumber(accountNumber);
             acc.setName(name);
             acc.setPassword(password);
             acc.setPhone(phone);
             acc.setBalance(balance);
              accDetails.add(acc);
       }

     

      
       
       public int ageCalculation(String dob) {
   		int age = 0;

   	       //direct age calculation

   	              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

   	              //convert String to LocalDate

   	              LocalDate localDate = LocalDate.parse(dob, formatter);

   	         LocalDate now = LocalDate.now(); //gets localDate

   	         Period diff = Period.between(localDate, now); //difference between the dates is calculated

   	         age = diff.getYears();

   	       return age;
   	}

       class SortbyAcc implements Comparator<Account> 
       { 
           // Used for sorting in ascending order of 
           // roll number 
           public int compare(Account a, Account b) 
           { 
               return a.getAccountNumber() - b.accountNumber; 
           } 
       } 
       public static void main(String[] a) throws IOException, TranscationException {

              Account acc = new Account();
              acc.takeAccountDetails();
       }
}