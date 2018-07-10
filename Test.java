class Arithmetic 
{
	int x=300,y=100;
	void add(int x,int y)
	{
		this.x=x;
		this.y=y;
		return (x+y);
	}
}
class adder extends Arithmetic
{
	void add(int x, int y)
	{
		this.x=x;
		this.y=y;
		return (x-y);
	}
}
class Test
{
public static void main(String[] args) 
	{
	adder a = new adder();
	a.add();
	}
}
