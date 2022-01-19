package multithread;
public class ThreadDemo
{
	public static void main(String[] args) {
		 Hi obj = new Hi();
   	Hello obj2 = new Hello();
   	obj.start();
   	obj2.start();
//		 obj.run();
//		 obj2.run();
		 //System.out.println("Hi");
	}
}