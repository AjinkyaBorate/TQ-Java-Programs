package oops.datamembers;

public class MyDate {
	int dd, mm, yy;

	public void display() {
		System.out.println("Date is : "+dd+"/"+mm+"/"+yy);
	}
	
	public void setDate(int d,int m,int y) {
		dd=d;
		mm=m;
		yy=y;
	}
	//
	public String toString() {
		return "Date is:"+dd+"/"+mm+"/"+yy;
	}
	public static void changeDate(MyDate d1) {
		//passing object as a parameter then refernce are pass
		d1.dd=21;
		d1.mm=9;
		
	}
	public static void main(String[] args) {
		MyDate obj=new MyDate();
		obj.setDate(6,9,2024);

		System.out.println(obj);
		
		changeDate(obj);
		System.out.println("Changed Date: "+obj);
		
	}

}
