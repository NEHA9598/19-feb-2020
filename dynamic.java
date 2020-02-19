
public class dynamic {
	int x=10;
	public void display()
	{
		int y=20;
		System.out.println("Class A");
	}

}
class B extends dynamic
{
	public void display()
	{
		System.out.println("Class B");
	}
}
class Test{
	public static void main(String args[])
	{
		dynamic d=new B();
		d.display();
	}
}
