package pkg1;

public class student
{

	int age;
	int roll;
	
	public void abc()
	{
		System.out.println("this is my age");
	}
	public void dcf()
	{
		System.out.println("this is my roll number");
	}
		
	public static void main(String[] args)
	{
		student aru=new student();
			aru.age=25;
			aru.abc();
			System.out.println(aru.age);
			aru.roll=1234;
			aru.dcf();
			System.out.println(aru.roll);
					
	}
}
	



