package newprogs;

public class Pbox {
	public static void main(String args[])
	{
		int l=3,b=5;
		System.out.print("The l and b are:"+l+" "+b);
		for(int i=1;i<=l;i++)
		{
			System.out.println();
			for(int j=1;j<=b;j++)
			{ 
			  if(i==1||i==l ||j==1||j==b)
			  { System.out.print("$ ");}
			  else
				  System.out.print("  ");
			
			}
		}
	}

}
