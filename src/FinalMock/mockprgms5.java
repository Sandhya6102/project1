package FinalMock;
import java.util.Scanner;
public class mockprgms5 {
public static void main(String[] args)
	{
	System.out.println("enter the password");
	Scanner sc=new Scanner(System.in);
	String pwd=sc.nextLine();
	int Ucount=0;
	int Lcount=0;
	int Ncount=0;
	int Scount=0;
	if(pwd.length()>=8)
	{
	for(int i=0;i<pwd.length();i++)
	{
	char ch=pwd.charAt(1);
	if(ch>='A' && ch<='Z')
	Ucount++;
	else if(ch>='a' && ch<='z')
	Lcount++;
	else if(ch>='0' && ch<='9')
	Ncount++;
	else
	Scount++;
	}
	if(Ucount>=1 && Lcount>=1 && Ncount>=1 && Scount>=1 )
	{
	System.out.println("valid password");

	}
	else
	{
	System.out.println("invalid password");
	}
	}
	}
}

