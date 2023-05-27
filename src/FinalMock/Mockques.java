//package FinalMock;
//import java.util.ArrayList;
//public class Mockques {
//	public static void main(String[] args) {
//	String str1="apple";
//    String str2="application";
//	String str3="applet";
//
//ArrayList<Character> a1 = new ArrayList<Character>();
//for(int i=0;i<str1.length();i++)
//{
//	a1.add(str1.charAt(i));
//}
//ArrayList<Character> a2 = new ArrayList<Character>();
//for(int i=0;i<str2.length();i++)
//{
//	a2.add(str2.charAt(i));
//}	
//ArrayList<Character> a3 = new ArrayList<Character>();
//for(int i=0; i<str3.length();i++)
//{
//	a3.add(str3.charAt(i));
//}
//for(int i=1;i<a1.size();i++)
//{
//  if(a1.contains(a2.get(i)))
//{
//	
//if(a2.contains(a3.get(i)))
//{
//	
//
//if(a3.contains(str3))
//{
//	System.out.println(str3);
//}
//}
package FinalMock;
class Sample
{
public static void main(String[] args)
{
String str="lokesh";
String res=" ";
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
res=res+ch;
}
}
System.out.println(res);
}
}






























