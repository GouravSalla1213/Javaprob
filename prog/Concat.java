package programs;

//import java.io.*;
import java.util.*;

public class Concat {

	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter a Word ");	    
	  String string = s.nextLine();
	  char[] cArr = string.toCharArray();
	  for (int j = 0; j < cArr.length; j++) 
	   {if (j % 2 == 0) 
	    System.out.print(cArr[j]);
	   }
	   System.out.print(" ");
	   for (int j = 0; j < cArr.length; j++) 
	     {if (j % 2 != 0) 
	      System.out.print(cArr[j]);
	     }
	   System.out.println();
	   s.close();
	    }
}

