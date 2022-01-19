package programs;
class Hat{
	int  price;
	char size;
	 public void show(){
		System.out.println("You are in show method:");
		System.out.println("The size of hat is :"+size);
		System.out.println("The price of the hat is :"+price+" Rs");
		}
          }
public class HatProb {
	public static void main(String args[])
	{
		char ne='n';
		System.out.println(ne);
		Hat n=new Hat();
		n.price=70; // price in Rs
		n.size='M';// size S M L
		n.show();
	}

}