package string_buffer_builder;

public class A2 {

	public static void main(String[] args) {
		//String Buffer
		
//		StringBuffer sb1 = new StringBuffer("Hello World");
//		StringBuffer sb2 = new StringBuffer("Hello World");
//		StringBuffer sb3 = new StringBuffer("Hello Java");
//
//		boolean isEqual1 = sb1.toString().equals(sb2.toString());
//		boolean isEqual2 = sb1.toString().equals(sb3.toString());
//		
//		System.out.println("sb1 and sb2 are equal: " + isEqual1);
//		System.out.println("sb1 and sb3 are equal: " + isEqual2);
		
		
		
		//String Builder
		
		StringBuilder sb1=new StringBuilder("Ajinkya");
		StringBuilder sb2=new StringBuilder("Ajinkya Borate");
		StringBuilder sb3=new StringBuilder("Ajinkya");
		
		boolean isEqual1 = sb1.toString().equals(sb2.toString());
		boolean isEqual2 = sb1.toString().equals(sb3.toString());
		
		System.out.println("sb1 and sb2 are equal: " + isEqual1);
		System.out.println("sb1 and sb3 are equal: " + isEqual2);

		}
}
