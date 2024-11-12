package generics;

public class NonGen {

	Object data;
	public NonGen() {
		// TODO Auto-generated constructor stub
	}
	public NonGen(Object o)
	{
		data=o;
	}
	public void showtype()
	{
		System.out.println(data.getClass().getTypeName());
	}
	public Object getData()
	{
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonGen o=new NonGen("Java");
		o.showtype();
		@SuppressWarnings("unused")
		String s=(String) o.getData();
		NonGen o1=new NonGen(10);
		o1.showtype();
		@SuppressWarnings("unused")
		Integer i=(Integer) o1.getData(); 
		//1 Every time we need to do the typecase while accessing the data
		// 2. Runtime Exception occured when we assigned object with different  data.
		o=o1;
		@SuppressWarnings("unused")
		String i1=(String) o.getData();
		
	    	
		

	}

}
