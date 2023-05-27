package Patternstopic2;
import java.util.Scanner;
public class Fetching {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
int n=sc.nextInt();
while(n!=0){
	int d=n%10;
	System.out.println(d);
	n=n/10;
	sc.close();
	}
}
}
