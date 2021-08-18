package newprogs;

public class TernaryOp {
public static void main(String args[])
		{
		int i=8,j=0;
		
		if(i>6)
			j=1;
		else j=2; 
		System.out.println(j);
		// ternary operator ? :
		j=(i>6)?3:4;
		System.out.println(j);
		
		}
}
