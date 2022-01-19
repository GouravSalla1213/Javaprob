package programs;
//import java.io.*;
import java.util.*;


public class SplitString {
	
	public static void main(String[] args) {
	         
	    Scanner s = new Scanner(System.in);
	    int N = s.nextInt();
	    s.nextLine();
	    for (int i = 0; i < N; i++) 
	    {   String string = s.nextLine();
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
	    } 
	        s.close();
	    }
	}



