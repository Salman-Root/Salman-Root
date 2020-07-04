package Exception1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 

 

public abstract class Account {

       int accountNumber,age;

       String name,phone,dob,accType;

       double balance;

       Scanner scanner;

      Transaction bObj;

       ArrayList<Integer> accountList;

      

       Account(){

              scanner = new Scanner(System.in);

              accountList = new ArrayList<Integer>();

              bObj = new Transaction();

       }

       public void setAccountNumber(int accountNumber) {

              this.accountNumber = accountNumber;

       }

       public void setName(String name) {

              this.name = name;

       }

       public void setPhone(String phone) {

              this.phone = phone;

       }

       public void setDob(String dob) {

              this.dob = dob;

       }
   public void setAge(int age) {

              this.age = age;

       }

 

       public void setAccType(String accType) {

              this.accType = accType;

       }

 

       public void setBalance(double balance) {

              this.balance = balance;

       }

       public String getName() {

              return name;

       }
      public String getPhone() {

              return phone;

       }
     public String getDob() {

              return dob;

       }
     public double getBalance() {

              return balance;

       }
      public int getAccountNumber() {

              return accountNumber;

       }
      public int getAge() {

              return age;

       }
    double checkBalance() {
     return balance;     

       }
   abstract void transact(Account another,String type,double amount) throws TranscationException;
   public String getAccType() {

              return accType;

       }


       void takeAccountDetails() throws IOException, TranscationException{

              String userChoice = "no";
                 do {

              System.out.println("Please enter the type of account");

             
              
              accType = scanner.nextLine();

              System.out.println("Please enter the Accounter's account number");

              accountNumber = scanner.nextInt();

              
              scanner.nextLine();

             
              
              if(accountList.contains(accountNumber)) {

                   
            	 System.out.println("Account already exists!!");

              }

              else {

                     accountList.add(accountNumber);

              System.out.println("please enter Accounter's name");

              name = scanner.nextLine();

              System.out.println("Please enter Accounter's Date of Birth DD/MM/YYYY");

              dob= scanner.nextLine();

              System.out.println("Please enter Accounter's Phone number");

              phone = scanner.nextLine();

              System.out.println("Please enter the  Initial Amount for deposit");

              balance =scanner.nextFloat();

              scanner.nextLine();

              age = bObj.ageCalculation(dob);

              bObj.populateAccounts(accountNumber, accType, name, dob, phone, balance, age);

              System.out.println("Account Have Been Created");

              }

              System.out.println("Do u want to enter another yes/no??");

              userChoice = scanner.nextLine();

              }while( userChoice.equalsIgnoreCase("yes"));

             

                     bObj.userOperation();

       }

	
}


 