package programs;
import java.util.*;

public class ArrowPattern 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number of lines N(odd):");
		int N= s.nextInt();
		s.close();
		if (N%2==0)
		{System.out.println("Entered number "+N+" is even ");}
		else {
		for (int i=1;i<=N;i++) 
		{
			System.out.println();
		 for(int j=N;j>=i;j--) 
		 {
			System.out.print("  ");
		 }
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print(" "+k);
		 }
		}
		
	        }
	}
}
