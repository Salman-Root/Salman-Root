package Srini;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String choice="";
		int number1=0;
		int number2=0;
		float result=0;
		boolean terminate=true;
		do {
			System.out.println("Enter Choice");
			choice=scanner.nextLine();
			if(choice.equalsIgnoreCase("exit"))
			{
			
			}
			else {
		System.out.println("Enter number 1");
		number1= scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter number 2");
		number2 = scanner.nextInt();
		scanner.nextLine();
			}
		switch(choice)
		{
		case "add":
			System.out.println("Addition of two numbers");
			result=number1+number2;
			System.out.println("The result"+result);
			break;
			
		case "sub":
			System.out.println("Subtraction of two numbers");
			result=number1-number2;
			System.out.println("The result is"+result);
			break;
			
		case "mul":
			System.out.println("Multiplication of two numbers");
			result=number1*number2;
			System.out.println("The result is"+result);
			break;
			
		case "div":
			System.out.println("Division of two numbers");
			result=number1/number2;
			System.out.println("The result is"+result);
			break;
		
		case "exit":
			System.out.println("The operations are completed");
			terminate=true;
			break;
			
			
		default:
			System.out.println("invalid input");
			break;
		}
		}while(terminate);
	}
}
	
