package pkg1;

public class son1 extends father
{
public void method2()
{
	System.out.println("i am the first child");
}
public static void main(String[] args) 
{
son1 ref=new son1();
ref.method();
ref.method2();

}
}
