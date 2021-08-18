package newprogs;

public class PtrnDlrBox {
	public static void main(String args[])
	{
		for(int i=0;i<4;i++)
		{
			System.out.println();
			for(int j=0;j<4;j++)
			{ 
			  if(i==0||i==3 ||j==0||j==3)	
				{System.out.print("$");}
			  else if(j==0||j==3)
			    { System.out.print("$");}
			  else {System.out.print(" ");}
			 }
		}
	}

}
