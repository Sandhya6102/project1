package FinalMock;
import java.util.ArrayList;
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1");
		String s1=sc.nextLine();
		System.out.println("enter the string2");
		String s2=sc.nextLine();
		System.out.println("enter the string3");
		String s3=sc.nextLine();
		String res1="";
		String res2="";
		String res3="";
		ArrayList<Character> l1=new ArrayList<Character>();
		for(int i=0;i<s1.length();i++)
		{
			l1.add(s1.charAt(i));
		}
		ArrayList<Character> l2=new ArrayList<Character>();
		for(int i=0;i<s2.length();i++)
		{
			l2.add(s2.charAt(i));
		}
		ArrayList<Character> l3=new ArrayList<Character>();
		for(int i=0;i<s3.length();i++)
		{
			l3.add(s3.charAt(i));
		}
		for(int i=0;i<l1.size();i++)
		{
			if(l1.contains(l2.get(i)))
			{
				if(l1.contains(l3.get(i)))
				{
					res1=res1+l1.get(i);
				}
			}
		}
		System.out.print(res1+" ");
		for(int j=0;j<l1.size();j++)
		{
			if(l2.contains(l1.get(j)))
			{
				if(l2.contains(l3.get(j)))
				{
					res2=res2+l2.get(j);
				}
			}
		}
		System.out.print(res2+" ");
		for(int k=0;k<l1.size();k++)
		{
			if(l3.contains(l1.get(k)))
			{
				if(l3.contains(l2.get(k)))
				{
					res3=res3+l3.get(k);
				}
			}
		}
		System.out.print(res3);
	}
}
