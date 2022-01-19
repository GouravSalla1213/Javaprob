package algoPractice;
import java.util.*;

public class LinearSearch {
	static int search(int arr[],int n,int x)
	{
		int i; 
		for(i=0;i<n;i++) 
		{
			if (arr[i]==x)
				return i;
		}
		 return -1;
	}
 
	public static void main(String[]Args) {
		System.out.println("Enter no of elements of array:");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr= new int[n];
		for (int i=0;i<n;i++) {
			System.out.printf("Enter %dth element of array ", i);
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the element to be searched in array:");
		
		int x= s.nextInt();
       //int n = arr.length;
		int r= search(arr, n, x);
		if(r!=-1)
         System.out.printf("%d is present at index %d", x, search(arr, n, x));
		else 
			{System.out.println(x+" is not found in array.");
			System.out.print("The array is : {");
			for (int i = 0; i < arr.length; i++)
				  System.out.print(" "+arr[i]);
			}
		System.out.println("}");
        s.close();
      }

}
