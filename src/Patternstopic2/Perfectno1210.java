package Patternstopic2;

public class Perfectno1210 {
public static void main(String[] args) {
	for(int n=1;n<=100;n++){
		int sum=0;
		for(int i=1;i<n/2;i++){
			if(n%1==0)
				sum=sum+i;
		}
	if(sum==n)
		System.out.println("perfect no");}
}
}
