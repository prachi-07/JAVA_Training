package assignment;

import java.lang.Character.Subset;
import java.util.Scanner;

public class ValidateEmail {

	public static void main(String[] args) {
		String email = "ianmo@g.ma@il.com"; 
		int a = email.indexOf("@");
		int b = email.indexOf(".");
		//int c = email.lastIndexOf("@");
		//int d = email.lastIndexOf(".");
		//String init = email.substring(0, email.indexOf("@"));
		//String init2 = email.substring(a, email.indexOf("."));
		//String str = email.substring(email.indexOf("."));
		// System.out.println(init);
		// String init2 = email.substring(email.indexOf("@"),email.indexOf("."));
		// System.out.println(init2);
		//Scanner sc = new Scanner(System.in);
		//if(sc.useDelimiter("@");
		// boolean b = email.contains(to_charemail.indexOf("@")); 
		if ( email.substring(0, a).length() > 4 
				&& email.substring(a, b).length() > 3 
				&& email.substring(b).length() > 2
				&& (b - a) > 0 
				&& email.lastIndexOf("@")==a 
				&& email.lastIndexOf(".")==b  ) {
			System.out.println("Validated email");
		} else {
			System.out.println("Invalid Email");
		}
	}
}
