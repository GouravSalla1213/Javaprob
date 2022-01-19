package algoPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Bs_prac {
	public static int bs(int[] arr,int req) {
		int f=0,l=arr.length-1;
		int mid=f+(l-f)/2;
		while(f<=l) 
		{
			if(req<arr[mid]) {
				l=mid-1;
			}else if(req >arr[mid]) {
				f=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

	public static void Main(String Args[]) {
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
		int ans = bs(arrs,num);
		if(ans==-1)
			System.out.println("Element"+num+"not found in array");
		else
			System.out.println("Element"+num+"found at :"+(ans+1)+"th place");
		
		
	}
}
