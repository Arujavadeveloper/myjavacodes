package pkg1;

import java.util.Scanner;

public class Calculation2 
{
		public int multi(int a, int b)
		{
			int c=a*b;
			System.out.println("the multi result is" +c);
			return c;
		} 
		 public int sub(int a1, int b1)
		 {
			int c1=a1-b1;
			System.out.println("the sub result is" +c1);
			return c1; 
		 }

		 public int sum(int a2, int b2)
		 {
			
			int c2=a2+b2;
			System.out.println("the sum result is" +c2);
			return c2;
		 }
		 public void div(int a3, int b3)
		 {
			int result;
			result=a3/b3;
			System.out.println("the final  result is" +result);
		 }
		 public static void main(String[] args) 
		 {
			System.out.println("please enter the data");
			Scanner obj2=new Scanner (System.in);
			int x1=obj2.nextInt();
			System.out.println("value of x1"+ x1);
			int x2=obj2.nextInt();
			System.out.println("value of x2"+ x2);
			int x3=obj2.nextInt();
			System.out.println("value of x3"+ x3);
			int x4=obj2.nextInt();
			System.out.println("value of x4"+ x4);
			int x5=obj2.nextInt();
			System.out.println("value of x5"+ x5);
			int x6=obj2.nextInt();
			System.out.println("value of x6"+ x6);
			Calculation2 ref1=new Calculation2();
			int multiresult=ref1.multi(x1,x2);
			int subresult=ref1.sub(multiresult,x3);
			int sumresult=ref1.sum(subresult,x4);
			int subresult2=ref1.sub(sumresult,x5);5
			50
			ref1.div(subresult2,x6);
		}
		 
}


