package programs;
import java.util.*;
public class SqureNum {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number :");
		double n=s.nextDouble();
		double t=Math.sqrt(n);
		System.out.println("Square root of "+n+" is "+t);
		if(n==(int)t*t)
			System.out.println(n+" is a sqaure number");
		else
			System.out.println(n+" is not a sqaure number");
        s.close();
	}
	
}
