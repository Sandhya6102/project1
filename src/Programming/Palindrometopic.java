package Programming;
public class Palindrometopic {
public static void main(String[] args) {
	String str="JAMES";
	String rev=" ";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(str==rev)
	{
		System.out.println("IT IS PALINDROME");
		
	}else
	{
		System.out.println("ITS NOT A PALINDROME");
	}
}
}
	
	
	


//C:\Users\Sandhya P\OneDrive\Desktop\jspiders java