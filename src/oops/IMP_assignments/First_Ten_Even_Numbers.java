package oops.IMP_assignments;

public class First_Ten_Even_Numbers {
	void show() {
		int n=10;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_Ten_Even_Numbers obj=new First_Ten_Even_Numbers();
		obj.show();
	}

}
