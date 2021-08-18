package newprogs;

public class Operator{
	/* Arithmetic: +,-,*,/,%
	 *  Bitwise:, Relational, Logical Operators
	 *  
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     short num1=8;
     short num2=6;
     short num3=2;
     //num3 = num1+num2;
     System.out.println(num3+num2+num1);
     int r1=num1+num2;
     int r2=num1-num3;
     int r3=num1*num2;
     double r4=(double)num1/num2; //gives quotient
     int r5=num1%num2;
     System.out.println(r1+" is r1; "+r2+" is r2; "+"r3 is "+r3);
     System.out.println(r4+" is r4; "+r5+" is r5");
     r1+=r2;// r1=r1+r2
     System.out.println("r1+r2 is"+ r1);
     r5++;//r5 is r5=r5+1
     System.out.println(r5+" is r5+1");
     //similarly we have n--and n-;
     num1=num2;
     System.out.println(num1);
     
	}

}
