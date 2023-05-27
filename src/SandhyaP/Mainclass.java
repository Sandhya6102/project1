package SandhyaP;
abstract class Tester
{
	abstract void cool();
	abstract void test();
}
class Demo1 extends Tester
{
	void cool()
	{
		System.out.println("Hi");
	}
	void test()
	{
		System.out.println("Hello");
	}
	
}
public class Mainclass {
public static void main(String[] args)
{
	Demo1 d1=new Demo1();
	d1.cool();
	d1.test();
}
}
