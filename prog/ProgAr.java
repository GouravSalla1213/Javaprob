package programs;

	// { Driver Code Starts
	//Initial Template for Java

	import java.util.*;
	//import java.lang.*;
	import java.io.*;

class ProgAr {
		public static void main(String[] args) throws IOException
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter no of elements of array n:");
			int n= s.nextInt();
			int[] a = new int[n];
			
			
			 for(int i=0;i<n;i++) {
				 System.out.println("Enter element "+(i+1));
				 a[i] =s.nextInt();
			 }
			 
			 
			 Comput obj = new Comput();
			 int r =obj.largest(a, n);
	         System.out.println("The largest Element of Array is : "+r);	
			 
			s.close(); 
		
		}		
}
	
class Comput {
	    
	    public int largest(int arr[], int n)
	    {
	      int i;
	      int max = arr[0];
	    for (i = 1; i < n; i++)
	        if (arr[i] > max) max = arr[i];

	    return max;
	    }
	}

