package oops.methods;
//WAP to print Series 1 22 333 4444 55555.....n;
public class RepititiveDigitsSeries {
	public void show(int terms) {
		for(int i=1;i<=terms;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(i);
			}
			System.out.print(" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepititiveDigitsSeries obj=new RepititiveDigitsSeries();
		obj.show(8);

	}

}
