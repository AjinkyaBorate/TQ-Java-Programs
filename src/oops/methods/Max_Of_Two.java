package oops.methods;
//WAP to find max of two
public class Max_Of_Two {
	// TODO Auto-generated method stub
	
	public int findMaximum(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	public static void main(String[] args) {
		
		Max_Of_Two obj = new Max_Of_Two();
		int max = obj.findMaximum(25, 37);
		System.out.println("Maximum of two is: " + max);

	}

}
