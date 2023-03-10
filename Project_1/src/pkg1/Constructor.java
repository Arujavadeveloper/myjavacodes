package pkg1;

public class Constructor
{
	public Constructor()
	{
		this(1,2,3);
		System.out.println("default constructor");
	}
	
	public Constructor(int a)
	{
		this();
		
		System.out.println("one parametrized constructor");
	}
	
	public Constructor(int a, int b)
	{
		this(1,2,3,4);
		System.out.println("two parametrized constructor");
	}
	
	public Constructor(int a, int b, int c)
	{
		
		
		System.out.println("three parametrized constructor");
	}
	
	public Constructor(int a, int b, int c,int d)
	{
		this(1);
		System.out.println("four parametrized constructor");
	}
	
	
	
	public static void main(String[] args) 
	{	
		Constructor obj=new Constructor(34, 12);
		
		
		
	}
}
