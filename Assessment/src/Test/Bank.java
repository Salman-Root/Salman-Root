package Test;

import java.util.Scanner;

public class Bank {


	
	
	Account[] account;
	static Customer[] customer;
	
	
	public Bank() {
		account = new Account[5];
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void createAccount() {
		// TODO Auto-generated method stub
		for(int i=0;i<account.length;i++)
		{
			account[i]=new Account();
			account[i].getAccountDetailsFromUser();
			
		}
		
	}
	

	
	
	void printAccountDetails() {
		for (int i = 0; i < account.length; i++) {
			account[i].displayDetails();
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank= new Bank();
		bank.createAccount();
		//
		//bank.printAccountDetails();

		bank.compareAccounts();
		
	}

	public void compareAccounts() {
		// TODO Auto-generated method stub
		for (int i = 0; i < account.length; i++) {
			for(int j=i+1;j<account.length;j++) {
				System.out.println("i"+i+"j"+j);
				if(account[i].getNumner()==account[j].getNumner())
				{
					account[i].displayDetails();
					account[j].displayDetails();
			}
			
		}
	}

	}
}
