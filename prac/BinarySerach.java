package algoPractice;
import java.util.*;
import java.util.Scanner;

public class BinarySerach {
/*	static int bs(int[] a,int x) {
		return x;
	}*/
	public static void main(String[] Args) {
		System.out.println("Enter no of elements of array:");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[] arr= new int[n]; //make space for taking array 
	for (int i=0;i<n;i++) 
		{
			System.out.printf("Enter %dth element of array ", i);
			arr[i]=s.nextInt();
		}
	System.out.println("Enter the element to be searched in array:");
		int num= s.nextInt();
		s.close();// close scanner
		int[] arrs=arr; //copy aray to new array
		Arrays.sort(arrs); //sort array
	//	int l=0,r=n-1;
		/*int res=bs(arrs);
		if(res!=1)
			System.out.println("Element found in array at index "+res);
		else
			{ System.out.println("Element not found in array");
			System.out.print("The array is : {");
			for (int i = 0; i < arr.length; i++)
				  System.out.print(" "+arr[i]);
			}
		 System.out.println("}");
			*/
		int low = 0;
	    int high = n - 1;
	    int mid = 0;
	 
	     //Binary Search Logic
	     while (low <= high) {
	 
	        //calculate mid 
	        mid = (low + high) / 2; 
	 
	       //If arr[mid] is equal to search element
	       if (arr[mid] == num) { 
	          System.out.print(" Value found at " + mid); 
	          break; 
	 
	       } else if (arr[mid] > num) {
	          high = mid - 1;
	 
	       } else if (num > arr[mid]) {
	         low = mid + 1;
	 
	       }
	   }
	 
	  // If value if not found
	  if (low > high) 
	  {
	      System.out.println(" Value is not found in an array ");
	  }
	 
	 
	}
}
 