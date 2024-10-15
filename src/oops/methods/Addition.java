package oops.methods;
//WAP to calculate addition of two numbers using method. 
public class Addition {
	public int add(int i, int j) {
		return i+j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
		int result=obj.add(12, 11);
		System.out.println("Addition is :"+result);
	}

}
