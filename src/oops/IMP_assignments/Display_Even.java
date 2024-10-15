package oops.IMP_assignments;

public class Display_Even {
	void show() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display_Even obj=new Display_Even();
		obj.show();
	}

}
