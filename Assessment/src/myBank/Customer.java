package myBank;

import java.util.Scanner;

public class Customer extends Account{
	Scanner scanner;
	String transactionType="";
public Customer() {
		
		// TODO Auto-generated constructor stub
		 scanner = new Scanner(System.in);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer= new Customer();
		customer.createAccount();
		SavingsAccount account= new SavingsAccount(20000);
		CurrentAccount account1= new CurrentAccount(20000);
		if(customer.getType().isEmpty())
		{
			customer.transact(customer.getAmount());
		
		}
		else
		{
			customer.transact(customer.getAmount(), customer.getType());
		}
		
		
		

	}

}
