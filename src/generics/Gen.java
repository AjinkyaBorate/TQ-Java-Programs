package generics;

public class Gen<T> {
	T obj;
    
	public Gen() {
		// TODO Auto-generated constructor stub
	}
	public Gen(T obj)
	{
		this.obj=obj;
	}
	public T getObject()
	{
		return obj;
	}
	public void showTypes()
	{
		System.out.println(obj.getClass().getTypeName());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> obj=new Gen<Integer>(10);
		@SuppressWarnings("unused")
		int i=obj.getObject();
		obj.showTypes();
		
		Gen<String> obj1=new Gen<String>("Java");
		@SuppressWarnings("unused")
		String str=obj1.getObject();
		obj1.showTypes();
		//obj=obj1; //compile time
		
	}

}
