package Patternstopic2;
import java.util.Scanner;
public class Factors {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no");
	int n=sc.nextInt();
	for(int i=1;i<=n/2;i++){
		if(n%i==0)
			System.out.println(i);
	
	sc.close();
	}
}
}
