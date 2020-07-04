package Test;

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone="Salman1223@#";
		String phone1=phone.replaceAll("[0-9, A-Z,a-z,!@#$%^&*()_+]" ,"*");
		System.out.println(""+phone1);
	}

}
