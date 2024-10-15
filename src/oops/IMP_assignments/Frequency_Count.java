package oops.IMP_assignments;

public class Frequency_Count {
	void digitCount(int n) {
		for (int i = 0; i <= 9; i++) {
			int count = 0;
			for (int j=n; j!= 0; j=j/10) {
				int digit=j%10;
				if (digit == i) {
					count++;
				}			
			}
			if (count>0) {
				System.out.println(i+" : "+count);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=18482048;
		Frequency_Count obj=new Frequency_Count();
		obj.digitCount(n);
		
	}

}
