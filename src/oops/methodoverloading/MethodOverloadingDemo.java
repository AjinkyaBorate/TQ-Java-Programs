package oops.methodoverloading;

public class MethodOverloadingDemo {
	public void add(int i,int j) {
		int sum=i+j;
		System.out.println("Sum is : "+sum);
	}
//	public int add(int i,int j) {
//		return i+j;
//	}
	public void add(float a,float b) {
		float sum=a+b;
		System.out.println("Sum is : "+sum);
	}
//	public float add(float a,float b) {
//		return a+b;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodOverloadingDemo obj=new  MethodOverloadingDemo();
		 obj.add(10,20);
		 obj.add(10f, 20f);
//		 System.out.println("sum is: "+obj.add(10, 20));
//		 System.out.println("sum is: "+obj.add(10f,20f));

	}

}
