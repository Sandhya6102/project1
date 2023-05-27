package Patternstopic2;

public class Alphabets {
static int n=5;
	
	public static void main(String[] args) {
		a();
		System.out.println("------------------------------");
		
		b();
		System.out.println("------------------------------");
		
		
		c();
		System.out.println("------------------------------");
		
		
		d();
		System.out.println("------------------------------");
		
		
		e();
		System.out.println("------------------------------");
		
		
		f();
		System.out.println("------------------------------");
		
		
		g();
		System.out.println("------------------------------");
		
		
		h();
		System.out.println("------------------------------");
		
		i();
		System.out.println("------------------------------");
		
		j();
		System.out.println("------------------------------");
		
		
		k();
		System.out.println("------------------------------");
		
		l();
		System.out.println("------------------------------");
		
		m();
		System.out.println("------------------------------");
		
		
		n();
		System.out.println("------------------------------");
		
		o();
		System.out.println("------------------------------");
		
		
		
		p();
		System.out.println("------------------------------");
		
		q();
		System.out.println("------------------------------");
		
		
		r();
		System.out.println("------------------------------");
		
		
		s();
		System.out.println("------------------------------");
		
		
		t();
		System.out.println("------------------------------");
		
		
		u();
		System.out.println("------------------------------");
		
		
		v();
		System.out.println("------------------------------");
		
		
		w();
		System.out.println("------------------------------");
		
		x();
		System.out.println("------------------------------");
		
		
		y();
		System.out.println("------------------------------");
		
		z();
		System.out.println("------------------------------");
		
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
	// TODO Auto-generated method stubint n=5;
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
