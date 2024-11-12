package wrapperClass.Wrapperfunctions;

import java.util.Scanner;

/*
 * Write a program that takes a boolean input from the user and uses the Boolean wrapper class 
 * to convert it to a string. Additionally, demonstrate how to parse a string back to a boolean value and print both values.*/
public class A8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter boolean value(true/false): ");
		boolean b = sc.nextBoolean();
		sc.close();
		
		String s = Boolean.toString(b);
		System.out.println("Boolean is converted to String object: "+s);
		
		//to check value is converted to string or not
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(ch[i] + " ");
		}
		
		//converting String to Boolean
		Boolean bool=Boolean.parseBoolean(s);
		System.out.println("\nString object converted to boolean object: "+bool);
		
	}

}
