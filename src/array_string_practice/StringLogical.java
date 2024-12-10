package array_string_practice;
public class StringLogical {
	
	static void displayarray(String s[])
	{
		for(String word:s)
		{
			System.out.println(word);
		}
	}
	static void sortArray(String s[])
	{
		// sort using length
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()==s[j].length())
				{
					if((s[i].compareTo(s[j]))>0)
					{
						// swap
						String temp= s[i];
						s[i]= s[j];
						s[j]= temp;
					}
					
				}
				else
					if(s[i].length()>s[j].length())
					{
						// swap
						String temp= s[i];
						s[i]= s[j];
						s[j]= temp;
					}
			}
		}
		
	}
	public static void main(String[] args) {
		
		String arr[]= {"ABU DHABI","AMSTERDAM","PARIS","LONDON","ROME","NAIROBI","ZURICH","NEW DELHI","CALIFORNIA"};
		System.out.println("Before:");
		displayarray(arr);
		System.out.println("----------------After Sorting----------------");
		sortArray(arr);
		displayarray(arr);	
	}

}
