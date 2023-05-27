package FinalMock;

public class mockrajaji {
public static void main(String[] args) {
	String str="Rajajinagar", ans=" ", s=str.toLowerCase();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		for(int j=0;j<s.length();j++)
		{
			if(ch == s.charAt(j)){
			if(i > j)
			{
				ans += "$";
				break;
			}
			else {
				ans += str.charAt(i);
				break;
				
			}
		}
	}
	
}
System.out.println(ans);
}
}
