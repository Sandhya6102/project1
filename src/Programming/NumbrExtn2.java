package Programming;

public class NumbrExtn2 {


	
	public static void main(String[] args) {
		String str="3A4C2L";
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int x=(int)(ch-48);
				for(int j=0;j<=x-1;j++)
				{
					
					System.out.println(ch);
				}
			}
			
		}
//		System.out.println(sum);
	}
	}


