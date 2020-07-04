package Srini;

public class RemoveDupliactes {
	
	public static void main(String args[])
	{
		String str="salmadana";
		StringBuilder sb = new StringBuilder();
	    char[] arr = str.toCharArray();
	 
	    for (char ch : arr) {
	        if (sb.indexOf(String.valueOf(ch)) != -1)
	            continue;
	        else
	            sb.append(ch);
	        sb.toString();
	    }
	    System.out.println(""+sb);
	}
}
	
