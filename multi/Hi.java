package multithread;

public class Hi extends Thread 
{
	 public void run()
	  {
		  for(int i=0;i<5;i++) 
					{	System.out.println("Hi");
						try{ Thread.sleep(10); }catch(Exception e) {}
					}
				}
}
