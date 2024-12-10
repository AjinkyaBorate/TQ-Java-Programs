package array_string_practice;
import java.util.Arrays;
public class ArrayLogicak {
	static void findmissingNumber(int ar[],int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(!checkNumber(ar, i))
			{
				count++;
			}
		}
		int missing[]= new int[count];
		int index=0;
		for(int i=1;i<=n;i++)
		{
			if(!checkNumber(ar, i))
			{
				missing[index++]=i;
			}
		}
		System.out.println(Arrays.toString(missing));
	}
	static boolean checkNumber(int ar[],int num)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==num)
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int arr[]= {4,3,2,7,8,2,3,1};
		Arrays.sort(arr);			
		int maxnum= arr[arr.length-1];
		findmissingNumber(arr, maxnum);
		
	}

}
