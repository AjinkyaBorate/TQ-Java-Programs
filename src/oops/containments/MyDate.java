package oops.containments;
//Containments using constructor/toString
public class MyDate {
	int dd,mm,yy;
	MyDate(){
		System.out.println("Paraneterized Constructor");
	}
	public MyDate(int dd, int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public String toString() {
		return "Date is: "+dd+"/"+mm+"/"+yy;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate obj =new MyDate();
		System.out.println(obj);
		
		MyDate obj1=new MyDate(24,9,2024);
		System.out.println(obj1);
	}

}
