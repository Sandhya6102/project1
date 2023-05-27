package Collectionstopic;

public class Sample1 {
	static Sample s1;
	int a=10;
	static int count = 0;
	private Sample1()
	{
		count++;
	}
	public static Sample getInstance()
	{
		if(count<1)
		{
			s1=new Sample();
			
		}
		return s1;
		
	}
	public static void setInstance(int a)
	{
		s1.a=a;
	}
	}
	class Mainclass
	{
		public static void main(String[] args) {
			
		
		Sample s2=Sample1.getInstance();
		System.out.println(s2.a);
		Sample s3=Sample1.getInstance();
		System.out.println(s3.a);
		Sample.setInstance(80);
}
	}
