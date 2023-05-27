package Patternstopic;

public class Sample1 {
	public static void main(String[] args)throws InterruptedException 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n/2+1||j==1||j==n){
					Thread.sleep(500);
					System.out.print("A");
			
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("************************************");
		int a=5;
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i==1||i==a/2+1||j==1||j==a){
					Thread.sleep(500);
					System.out.print("A");
			
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
