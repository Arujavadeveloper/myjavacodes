package pkg1;

public class swiftVDI extends swift
{
public void mtype()
{
	System.out.println("i am the child class");
}
public static void main(String[] args) 
{
	swiftVDI re=new swiftVDI();
	re.modeltype();
	re.mtype();
	re.price();
	re.price=122;
	System.out.println("the price is+ re.price");

}
}
