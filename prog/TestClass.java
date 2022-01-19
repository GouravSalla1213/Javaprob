package programs;

import java.util.*;
import java.util.ArrayList;
//import java.util.Collections;




class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s = new Scanner(System.in);
       
        	int T = s.nextInt();
        
        int N = s.nextInt(); 
        int K = s.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=1;i<=N;i++)
        {
            a.add(s.nextInt());
            
        }
        System.out.println("T is :"+T);  
        System.out.println("N is :"+N);
        System.out.println("K is :"+K);
        System.out.println(a);
        for (int i :a) {
            System.out.print(i+" ");
          }
       s.close();
    }
    
}
    
    

