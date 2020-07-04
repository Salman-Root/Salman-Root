package Srini;

import java.util.Scanner;

public class StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char alpha1='\0';
		char alpha2='\0';
		String word="";
		char[] wordArray;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Word");
		word=scanner.nextLine();
		System.out.println("Alpha 1");
		alpha1=scanner.next().charAt(0);
		System.out.println("Alpha 2");
		alpha2=scanner.next().charAt(0);
		wordArray=new char[word.length()];
		int count=0;
		StringBuilder sb = new StringBuilder();
	    char[] arr = word.toCharArray();
	 
	    for (char ch : arr) {
	        if (sb.indexOf(String.valueOf(ch)) != -1)
	            continue;
	        else
	            sb.append(ch);
	    }
	    word=sb.toString();
		for(int i=0;i<word.length();i++)
		{
			wordArray[i]=word.charAt(i);
			if(count==0) {
			if(wordArray[i]==alpha1  || wordArray[i]==alpha2)
			{	
				System.out.println("First"+wordArray[i]);
				count++;
				continue;
			}
			}
			if(count==1 &&( wordArray[i]==alpha1 || wordArray[i]==alpha2))
			{
			System.out.println("Then"+wordArray[i]);
			count++;
			break;
			}
			}
	
		if(count==1 || count==2)
		{
		System.out.println("Alphabets Present");
		}
		else
		{
		System.out.println("Sorry the alphabets are not present in the string");	
		}
	}
}
		
		
	


