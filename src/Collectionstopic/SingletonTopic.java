package Collectionstopic;

public class SingletonTopic {
static Sample s1;
int a=10;
static int count = 0;
private Sample()
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
	Sample s2=Sample.getInstance();
	system.out.println(s2.a);
	Sample s3=Sample.getInstance();
	system.out.println(s3.a);
	Sample.setInstance(80);
}