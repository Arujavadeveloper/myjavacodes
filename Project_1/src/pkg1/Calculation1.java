package pkg1;

import java.util.Scanner;

public class Calculation1
{
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("the sum result is" +c);
		return c;
	} 
	 public int sub(int a1, int b1)
	 {
		int c1=a1-b1;
		System.out.println("the sub result is" +c1);
		return c1; 
	 }

	 public int div(int a2, int b2)
	 {
		
		int c2=a2/b2;
		System.out.println("the div result is" +c2);
		return c2;
	 }
	 public void multi(int a3, int b3)
	 {
		int result;
		result=a3*b3;
		System.out.println("the final  result is" +result);
	 }

public static void main(String[] args) 
{
	System.out.println("please enter the values");
	Scanner obj1=new Scanner(System.in);
	int x1=obj1.nextInt();
	System.out.println("value of x1"+ x1);
	int x2=obj1.nextInt();
	System.out.println("value of x2"+ x2);
	int x3=obj1.nextInt();
	System.out.println("value of x3"+ x3);
	int x4=obj1.nextInt();
	System.out.println("value of x4"+ x4);
	int x5=obj1.nextInt();
	System.out.println("value of x5"+ x5);
	int x6=obj1.nextInt();
	System.out.println("value of x6"+ x6);
	Calculation1 ref=new Calculation1();
	int sumresult1=ref.sum(x1,x2);
	int sumresult2=ref.sum(sumresult1,x3);
	int subresult=ref.sub(sumresult2, x4);
	int divresult=ref.div(subresult,x5);
	ref.multi(divresult,x6);
	
	
}
}
