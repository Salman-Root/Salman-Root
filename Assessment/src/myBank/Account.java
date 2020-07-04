package myBank;

import java.util.Scanner;

public class Account {
	Scanner scanner;
	private String name="";
	private int number=0;
	private float balance=0;
	private String type="";
	private String transactionType="";
	private float amount=0;
	SavingsAccount account;
	CurrentAccount account1;
	

public Account() {
		
		// TODO Auto-generated constructor stub
		 scanner = new Scanner(System.in);
		 
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public void createAccount()
	{
		System.out.println("Please enter the Customer name ");
		name = scanner.nextLine();
		if(name!=null)
		{
		setName(name);
		}
		System.out.println("Please enter the Customer number ");
		number = scanner.nextInt();
		if(number!=0) {
		setNumber(number);
		}
		System.out.println("Please enter the amount ");
		amount = scanner.nextFloat();
		scanner.nextLine();
		if(amount!=0) {
		setAmount(amount);
		}
		System.out.println("Please enter the Account type ");
		type=scanner.nextLine();
		if(type!=null)
		{
			setType(type);
		}
		System.out.println("Please enter the transaction type ");
		transactionType=scanner.nextLine();
		
		if(transactionType!=null)
		{
			setTransactionType(transactionType);
		}
	}
	public void transact(float amount,String type) {
		if(getTransactionType().equalsIgnoreCase("deposit"))
		{
			if(getType().equalsIgnoreCase("Savings"))
			{
				balance=account.balance;
			balance=balance+amount;
			System.out.println("Amount deposited");
		}
			else if(getType().equalsIgnoreCase("Current"))
			{
				balance=account1.balance;
			balance=balance+amount;
			System.out.println("Amount deposited");
		}
		}
		else if(getTransactionType().equalsIgnoreCase("withdraw"))
				{
			if(getType().equalsIgnoreCase("Savings"))
			{
				balance=account.balance;
				System.out.println("b"+balance);
				balance=balance-amount;
				if(balance<5000)
				{
					System.out.println("minimum balance is 5000 ,amount cant be withdrawed");
				}
				else {
				System.out.println("Amount withdrawed");
				}
				}
			else if(getType().equalsIgnoreCase("Current"))
			{
				balance=account1.balance;
				balance=balance-amount;
				if(balance<10000)
				{
					System.out.println("minimum balance is 10000 ,amount cant be withdrawed");
				}
				else {
				System.out.println("Amount withdrawed");
				}
			}
			
}
	}
	public void transact(float amount) {
		
		if(getType().equalsIgnoreCase("Savings"))
		{
			balance=account.balance;
		balance=balance+amount;
		System.out.println("Amount deposited");
	}
		else if(getType().equalsIgnoreCase("Current"))
		{
			balance=account1.balance;
			balance=getBalance();
		balance=balance+amount;
		System.out.println("Amount deposited");
		
	
}}
}