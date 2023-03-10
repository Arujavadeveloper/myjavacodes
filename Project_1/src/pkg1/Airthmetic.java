package pkg1;

public class Airthmetic
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
 public int multi(int a2, int b2)
 {
	int c2=a2*b2;
	System.out.println("the multi result is" +c2);
	return c2; 
 }
 
 public void div(int a3, int b3)
 {
	int result;
	result=a3/b3;
	System.out.println("the final result is" +result);
 }
	public static void main(String[] args) 
	{
		Airthmetic obj=new Airthmetic();
		int sumresult=obj.sum(10,2);
		int sumresult2=obj.sum(sumresult,2);
		int subresult=obj.sub(sumresult2,2);
		int multiresult=obj.multi(subresult,2);
		obj.div(multiresult,2);
		
	}
		
}
