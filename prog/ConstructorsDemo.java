package programs;
class Calc
{
	int num1,num2,num3;
	public Calc() 
	{
	 num1=5;
	 System.out.println("Calc is running: ");
	}
	public Calc(int n)
	{
		num1=n;
		num2=n;
		System.out.println("New construtor:");
	}
	public Calc(double n,int k)
	{
		num1=(int)n;
		num2=k;
		System.out.println("New meta construtor:");
	}
}
public class ConstructorsDemo {
	public static void main(String args[])
	{
		Calc prob=new Calc();
		System.out.println(prob.num1);
		Calc prob2=new Calc(9);
		System.out.println(prob2.num2);
		Calc prob3=new Calc(7.8,3);
		System.out.println(prob3.num1+" "+prob3.num2);
	}

}
