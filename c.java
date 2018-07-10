class main{
	int a;
    int b;
	int c ;

	main(int a,int b,int c)
	{
	this.a=a;
	this.b=b;
	this.c=c;
	}
	void m1(){
	System.out.println("BASE CLASS "+a+b+c);
	}

}

class a extends main{
	int d;

	a(int a,int b,int c, int d)
	{
	super( a, b, c);
	this.d=d;
	}
	void m2() {
	System.out.println(a+b+c+d);

	}
}


class s
{
	public static void main(String[] args) 
	{
		a n=new a(10,20,30,40);
		a n1=new a(1,2,3,4);
        n.m1();
		n1.m1();
		n.m2();
		n1.m2();
	}
}
