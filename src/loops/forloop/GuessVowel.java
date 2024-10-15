package loops.forloop;

import java.util.Scanner;

public class GuessVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter any alphabet: ");
		char guess=sc.next().charAt(0);	
		if(guess=='a'||guess=='e'||guess=='i'||guess=='o'||guess=='u') {
			System.out.println(guess+" is vowel");
		}
		else {
			System.out.println(guess+" is consonant");
		
		}
		sc.close();
	}

}
