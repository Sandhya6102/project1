package Patternstopic2;

public class Name {
	public static void main(String[] args) {
		String str="nandini";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			switch(ch){
			case'a':a();
		System.out.println("------------------------------");
		break;
			case'b':b();
		System.out.println("------------------------------");
		break;
			case'c':c();
		System.out.println("------------------------------");
		break;
		
			case'd':d();
		System.out.println("------------------------------");
		break;
			case'e':e();
		System.out.println("------------------------------");
		break;
			case'f':
		f();
		System.out.println("------------------------------");
		break;
			case'g':
		g();
		System.out.println("------------------------------");
		break;
			case'h':
		h();
		System.out.println("------------------------------");
		break;
			case'i':
		i();
		System.out.println("------------------------------");
		break;
			case'j':
		j();
		System.out.println("------------------------------");
		break;
			case'k':
		
		k();
		System.out.println("------------------------------");
		break;
			case'l':
		l();
		System.out.println("------------------------------");
		break;
			case'm':
		m();
		System.out.println("------------------------------");
		break;
			case'n':
		n();
		System.out.println("------------------------------");
		break;
			case'o':
		o();
		System.out.println("------------------------------");
		break;
			case'p':
		
		p();
		System.out.println("------------------------------");
		break;
			case'q':
		q();
		System.out.println("------------------------------");
		break;
			case'r':
		
		r();
		System.out.println("------------------------------");
		break;
			case's':
		s();
		System.out.println("------------------------------");
		break;
			case't':
		t();
		System.out.println("------------------------------");
		break;
			case'u':
		u();
		System.out.println("------------------------------");
		break;
			case'v':
		v();
		System.out.println("------------------------------");
		break;
			case'w':
		w();
		System.out.println("------------------------------");
		break;
			case'x':
		x();
		System.out.println("------------------------------");
		break;
			case'y':	y();
		System.out.println("------------------------------");
		break;
			case'z':z();
		System.out.println("------------------------------");
		break;
		
	}
		}
	}

private static void a() {
		// TODO Auto-generated method stub
		
	int n=5;
	int x=n;
	
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<2*n;j++)
		{
			if(j==x||j==n+i-1)
			{
				System.out.print("*");
			
			}
			else if((j>=x)!=false && j<=n+i-1 && i==n/2+1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		x--;
	}
	}

private static void b() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n;i++)
	{
	for(int j=1;j<=n;j++)
	{
		if(j==1||((i==1 || i==n|| i==n/2+1)&&j<=n-1))
		{
			System.out.print("*");
			
		} else if(i!=1&&i!=n&&j==n)
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}
	System.out.println();
	}
}
private static void c() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1 ||i==n||j==1)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
}
private static void d() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if (j==1||((i==1||i==n)&&j<=n-1))
			{
				System.out.print("*");
			}
			else if(i!=1 && i!=n&&j==n)
			{
				System.out.print("*");
				
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	
private static void e() {
	// TODO Auto-generated method stub 
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1|i==n/2+1 ||i==n||j==1)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
}
	
private static void f() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1|i==n/2+1||j==1)
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	
}
private static void g() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||i==1||i==n||(i>n/2&&j==n)||(i==(n/2+1)&&j>n/2))
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
}
private static void h() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||i==1||i==n||(i>n/2&&j==n)||(i==(n/2+1)&&j>n/2))
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
}
private static void i() {
int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||i==n||j==n/2+1)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
}

private static void j() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if( i==1||(i==n&&j<=n/2+1)||j==n/2+1)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
}


private static void k() {
	// TODO Auto-generated method stub
	int n=5;
	int x=n/2+1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n/2+1;j++)
		{
			if(j==1||j==x)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
			}
		if(i<=n/2)
		{
			x--;
		}
			else{
				x++;
			}
				
				System.out.println();
			}
		}

	
private static void l() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||(i==n&&j<=(n/2)+1))
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
	
	
}
private static void m() {
	// TODO Auto-generated method stub
	int n=5;
	int x=1;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||j==n ||((j==x||j==n-x+1)&&i<=n/2+1))
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		x++;
		System.out.println();
		}
	
	
}
private static void n(){
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||j==n||i==j)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
	
}
private static void o() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||j==n||i==1||i==n)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
	
}
private static void p() {
	// TODO Auto-generated method stub
	int n=5;
	int x=(n/2)+1;
	
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if((i==1&&j<=x)||j==1||(j==x&&i<=x)||(i==x&&j<=x))
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
	
}private static void q() {
	// TODO Auto-generated method stub
	int n=7;
	int x=n-n/2+1;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if (((i==1||i==x+1)&&j<=x+1)||((j==1||j==x+1)&&i<=x+1))
			{
				System.out.print("*");
			}
			else if(j==i && i>=x)
			{
				System.out.print("*");
				
			}
			else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
		}
			
	

private static void r() {
	// TODO Auto-generated method stub
	int n=7;
	int x=1;
	for( int i=1;i<=n;i++)
	{
		for( int j=1;j<=n/2+1;j++)
		{
			if(j==1||i==1||i==n/2+1||(i<=n/2&&j==n/2+1)||j==x)
			{
				System.out.print("*");
				
			}
			else
			{
				System.out.print(" ");
			}
		}
		if(i>n/2)
		{
			x++;
		}
			System.out.println();
		}
	}
	
	
private static void s() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||i==n||i==n/2+1||(j==1&& i<=n/2+1)||(j==n&&i>n/2+1))
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
	
	
}
private static void t() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||j==n/2+1)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	}
private static void u() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==1||j==n||i==n)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
}
private static void v() {
	// TODO Auto-generated method stub
	int n=5;
	int x=1;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<2*n;j++)
		{
			if(j==x||j==2*n-x)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		x++;
		}
	}
private static void w() {
	// TODO Auto-generated method stub
	int n=5;
	int x=n;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<2*n;j++)
		{
			if(j==1||j==2*n-1||j==x||j==2*n-x)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
	x--;
	}
	
	
	
	
}
private static void x() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(j==i||j==n-i+1)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
}
private static void y() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if((j==i||j==n-i+1)&&i<=n/2+1||(j==n/2+1&&i>n/2))
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
	
	
}
private static void z() {
	// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1||i==n||j==n-i+1)
			{
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
				
			}
		System.out.println();
		}
	
	
	
}

}

