package Programming;

public class NumberExtn {
public static void main(String[] args) {
	String str="3A4C2L";
	String ans="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='0' && ch<='9')
		{
			int x=(int)(ch-48);
			char ch1=str.charAt(i);
			int num=(int)ch1+1;
			ch1=(char)num;
			for(int j=0;j<=x-1;j++)
			{
				
				
				System.out.println(ch1);
			}}
		}
		
	}

}

