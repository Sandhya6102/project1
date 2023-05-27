package FinalMock;

public class mockprgms4 {
	public static void main(String[] args)
	{
	String str="lokesh";
	String res=" ";
	for(int i=0;i<str.length();i++)
	{
	char ch=str.charAt(i);
	if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')==false)
	{
	res=res+ch;
	}
	}
	System.out.println(res);
	}
	}


