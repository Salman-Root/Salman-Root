package Collection;

import java.util.Stack;

public class Stac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s= new Stack<Integer>();
		s.push(0);
		s.push(1);
		s.push(7);
		s.push(8);
		
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		System.out.println(s.search(1));
		
		System.out.println("s"+s);
	}

}
