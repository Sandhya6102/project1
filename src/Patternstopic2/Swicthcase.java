package Patternstopic2;

public class Swicthcase {
public static void main(String[] args) {
	int n=145;
	int copy=n;
	int sum=0;
	while(n!=0){
		int rem=n%10;
		int no=rem;
		int fact=1;
		for(int i=no;i>=1;i--){
			fact=fact*i;
		}
	sum=sum+fact;
	n=n/10;
	}
if(copy==sum){
	System.out.println("strong no");}
}
}
