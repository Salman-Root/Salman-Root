package Collection;

import java.util.ArrayList;

public class Col {
	static ArrayList s= new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Col c=  new Col();
		
		s.add("Salman");
		s.add("Root");
		s.add("shaw");
		System.out.println("Dis"+s);
		c.removebyname("Salman");
		c.removebyposition(0);
		c.modify(0,"Hello");
		int nu=c.search("Hello");
		System.out.println("posi"+nu);
		if(nu==0)
		{
			c.modify(0, "Root");
		}
		else
		{
			System.out.println("invalid");
		}
		System.out.println("S"+s);
		
		
		

	}
	public void removebyposition(int pos)
	{
		s.remove(pos);
	}
	public void removebyname(String name)
	{
		s.remove("shaw");
	}
	
	public void modify(int pos,String name)
	{
		s.set(pos,name);
	}
	
	public int search(String name)
	{
		return s.indexOf(name);	}

}
