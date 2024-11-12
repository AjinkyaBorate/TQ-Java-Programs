package collections.List.ArrayList;

import java.util.ArrayList;

//1.Create aarraylist of string. Add 7 days to list ( Monday , Sunday etc) Remove elements from list 
//for which string length is more than 7   
public class A1 {
	public static void main(String[] args) {
		
		ArrayList <String> days=new ArrayList<String>();
		
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");

		System.out.println(days);
		
		for(int i=0;i<days.size();i++) {
			if(days.get(i).length()>7) {
				days.remove(i);
				i--;
			}
		}
		System.out.println(days);
	}

}
