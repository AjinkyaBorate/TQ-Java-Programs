package basics;

public class Swapping {
	public static void main(String[] args) {
		
// With Third variable			
//		int a = 1;
//		int b = 2;
//		int third;
//
//		System.out.println("Before swapping:");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//
//		third = a;
//		a = b;
//		b = third;
//		
//		System.out.println("After swapping:");
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);4
		
		
        // Swap logic without using a third variable
		int a = 1;
        int b = 2;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; 
        b = a - b; 
        a = a - b; 

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
		
	}
}
