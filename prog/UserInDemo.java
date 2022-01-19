package programs;
import java.util.*;

public class UserInDemo {
	    public static void main(String args[] ) {
	       
	        

	    	System.out.println("Please enter ur name:");
	        Scanner s = new Scanner(System.in);
	        String name = s.nextLine();       
	        // Reading input from STDIN
	       
	        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
            System.out.println("Enter ur age:");
            int age=s.nextInt();
            System.out.println(name+",Your age is :"+age+"years");
            if (age>=18)
            	System.out.println("Eligible for vote;Apply for voter ID");
            else
            	System.out.println("You can vote after "+(18-age)+"years");
            
         s.close();
	        
	    }
	}
