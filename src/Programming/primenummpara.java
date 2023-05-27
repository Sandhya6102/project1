package Programming;

public class primenummpara {
static void pri(int no){
	boolean flag=true;
	for (int i = 2; i <no; i++) {
		if(no%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println(no +"-> is a prime no");
		
	}else
	{
		System.out.println(no +"-> is not a prime no");
	}
}
public static void main(String[] args) {
	pri(11);
}
}

