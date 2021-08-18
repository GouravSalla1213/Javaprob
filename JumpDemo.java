package newprogs;

public class JumpDemo {
	public static void main(String args[])
	{
		for(int i=0;i<10;i++)
		{
			if(i==7) 
			{
				break;
			}
		System.out.println(i+" ");
		}// prints 0 to 6
		
		for(int i=0;i<10;i++)
		{
			if(i==5) 
			{
				continue;
			}
		System.out.println(i+" ");
		}// prints 0 to 9, except 5 
		
	}
}
