package oops.IMP_assignments;

public class Display_Odd {
	void show() {
		for(int i=200;i<=300;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display_Odd obj=new Display_Odd();
		obj.show();
	}

}
