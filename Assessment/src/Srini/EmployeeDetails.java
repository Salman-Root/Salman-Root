package Srini;

import java.util.Scanner;

public class EmployeeDetails {
	String[] name= new String[100];
	int[] id = new int[100];
	int[] phone=new int[100];
	int[] age= new int[100];
	String choice="";
	boolean terminate=false;
	Scanner scanner= new Scanner(System.in);
	int count=0;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		EmployeeDetails empDetails=new EmployeeDetails();
		empDetails.getEmployee();
		empDetails.getEmployeeDetail();
		
	}

	public void getEmployeeDetail() {
		// TODO Auto-generated method stub
		int id1=0;
		System.out.println("Enter the employee id to fetch details");
		id1=scanner.nextInt();
		for(int i=0;;i++)
		{
			if(id[i]==id1)
			{
			System.out.println("Employee id"+id[i]+ "Employee name"+name[i]+"Employee age"+age[i]+"Employee phone"+phone[i] );
			break;
	}
	}
	}

	public void getEmployee() {
		// TODO Auto-generated method stub
		do{
			for( int i=0;;i++) {
		System.out.println("Please enter the id");
		id[i] = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter name");
		name[i] = scanner.nextLine();
		System.out.println("Please enter phone");
		phone[i]=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter age");
		age[i]=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Do you need to add more. Enter continue else enter exit");
		choice=scanner.nextLine();
		count++;
		if(choice.equalsIgnoreCase("exit"))
		{
			terminate=true;
			break;
		}
			}
	}while(!terminate);
	}
}
