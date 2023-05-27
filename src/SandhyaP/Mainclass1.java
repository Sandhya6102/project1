package SandhyaP;
abstract class Sam
{
	abstract void disp();
	abstract void test();
}
abstract class Jav extends Sam
{
	
	void test()
	{
		System.out.println("Hello");
	}
	
}
class Tester extends Jav
{
	void disp()
	{
		System.out.println("Hi");
	}
}

public class Mainclass1 {
public static void main(String[] args)
{
	Tester t1=new Tester();
	t1.disp();
	t1.test();
}
}

