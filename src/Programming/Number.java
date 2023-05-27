package Programming;

public class Number {
public static void main(String[] args) {
	String str="3A4C2L";
	String ans="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch>='0' && ch<='9')
		{
			int x=(int)(ch-48);
			for(int j=1;j<=x;j++)
			{
				ans=ans+ch(j+1);
			}
			System.out.println(ans);
		}
	}
}
}
