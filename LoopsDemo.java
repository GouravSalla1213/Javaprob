package newprogs;

public class LoopsDemo {
	public static void main(String args[])
	{
	//while,do while,for,for-each 
		int i=0;
	//while loop
		while(i<=6)
		{
			System.out.println("Hello"+i);
			i++;
		}
	//do while
		do {
			System.out.println("Hi"+i);
			i++;
	       }while(i<=6);
		System.out.println(i);
	//the condition is checked after executing the loop atleast once	
	// for loop
		for(int j=0;j<6;j++)
		{
			System.out.println(j);
		}
	// for each loop
	
	}
    
}
