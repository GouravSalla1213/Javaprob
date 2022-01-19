package programs;

class Demo //class Demo
{
	int i,j,k;            // variables
	public void present() // method present
	{
		k=i+j;
	}
}
public class ObjectDemo {
	public static void main(String args[])
	{	
		 Demo na=new Demo();
		 na.i=3;
		 na.j=4;
		 na.present();
		 System.out.println(na.k);
	}

}
