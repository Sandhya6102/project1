package FinalMock;

public class Prgmmng {
public static void main(String[] args) {
	String str="rajajinagar";//rajajinagar
							 //raj$$in$g$$
	String res=" ";
	for(int i=0;i<=str.length();i--)
	{
		char ch=str.charAt(i);
		res=res+ch;
	}
	System.out.println(res);
}
}
