package Programming;

public class Primenumpara2 {
	static void prime(int j,int l){
		for(int k=j;k<=l;k++){
		int no=k;
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
			
		}
		}

}
	public static void main(String[] args) {
		prime(2,100);
	}}