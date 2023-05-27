package shutdown;

import java.io.IOException;
import java.util.Scanner;

public class Shutdownprgm {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the time limits in seconds");
	int sec=sc.nextInt();
	Runtime rt=Runtime.getRuntime();
	System.out.println("The system will shutdown within " +sec+ "seconds");
	try{
		rt.exec("shutdown -s -t " +sec);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
