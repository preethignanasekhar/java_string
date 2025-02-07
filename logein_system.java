import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter usre name");
	    String username=s.next();
	    System.out.println(username.trim());
	    System.out.println("enter password");
	    String password=s.next();
	    String pass=(password.trim());
	    String storedpassword="preethi";
	    
	    
	    if(storedpassword.equals(password)){
	        System.out.println("you have been logein");
	    }
	    else{
	        System.out.println("your password is incorrect");
	    }
	    }
}




// String str1="   hello world";

	//	System.out.println(str1.trim());
