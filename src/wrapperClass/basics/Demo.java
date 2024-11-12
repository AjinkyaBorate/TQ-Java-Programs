package wrapperClass.basics;

public class Demo {

	public static void main(String[] args) {
		//converting primitive into object: boxing
		int i=10;
		@SuppressWarnings("removal")
		Integer iobj=new Integer(i);
		//converting object into primitve:unboxing
		@SuppressWarnings("unused")
		int o=iobj.intValue();	
		
		@SuppressWarnings("removal")
		Float fobj=new Float(10.4f);
		@SuppressWarnings("unused")
		float f=fobj.floatValue();
		
		//jdk1.5 autoboxing and autounboxing
		int i1=10;
		Integer obj1=i1; //primitive automatically converted to object
		
		@SuppressWarnings("unused")
		int j=obj1;//object automatically converted to primitive type
		
		
		//parseXXX():convert string to respective wrapper class
		String str="10";
		int n=Integer.parseInt(str);//string to Integer
		System.out.println(n);
		
		String str1="12.4";
		double d=Double.parseDouble(str1);//string to Double
		System.out.println(d);
		
		//wrapper type to Sttring
		Integer obj=15;
		String s=String.valueOf(obj);
		System.out.println(s);
		
		//xxxValue()
		
	}

}
