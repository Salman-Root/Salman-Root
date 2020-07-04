package Acc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bank {


	
	
	static Account[] account;
	static Customer[] customer;
	
	
	public Bank() {
		account = new Account[2];
		
		
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
		bank.convertToCollection(account);
		//
		//bank.printAccountDetails();

		//bank.compareAccounts();
		
	}

	private void convertToCollection(Account[] account2) {
		// TODO Auto-generated method stub
		List list =new ArrayList();
		list.add(account2);
		Iterator it= list.iterator();
		while(it.hasNext())
		{
			System.out.println("i"+it.next().toString());
		}
		
		
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
