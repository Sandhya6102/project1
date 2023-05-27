package Patternstopic2;
import java.util.Scanner;
public class Perfectno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no.");
	int sum=0;
	int n=sc.nextInt();
	for(int i=1;i<=n/2;i++){
		if(n%i==0)
			sum=sum+i;}
	if(sum==n){
		System.out.println("perfect no.");
			}
	else{
		System.out.println("not a perfect");
	}
	sc.close();
}
}
