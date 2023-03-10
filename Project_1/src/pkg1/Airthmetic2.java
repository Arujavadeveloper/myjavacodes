package pkg1;

public class Airthmetic2 
{
public int div(int a, int b)
{

	int c=a/b;
	System.out.println("the div result is" +c);
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
int c2=a2/b2;
System.out.println("the sumresult is" +c2);
return c2;
}
public void multi(int a3, int b3)
{
int result;
result=a3*b3;
System.out.println("the final result is" +result);
}
public static void main(String[] args) {
	
	Airthmetic2 ref=new Airthmetic2();
	int divresult=ref.div(10,2);
	int subresult=ref.sub(divresult,2);
	int sumresult=ref.sum(subresult,2);
	int subresult2=ref.sub(sumresult,2);
	ref.multi(subresult2,2);
}

}
