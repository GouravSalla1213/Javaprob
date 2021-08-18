package newprogs;

public class TestOper {
	public static void main(String args[])
	{
		int m=5;
		int n=4;
		/*m=n;
		System.out.println(m+" "+n);
		*/
		m=n++;
		System.out.println(m+" "+n);
		m=++n;
		System.out.println(m+" "+n);
	}

}
