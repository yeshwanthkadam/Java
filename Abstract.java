abstract class phone
{
	void ring()
	{
		System.out.println("Ringing.........");
	}
	abstract void vibrate();//abstract
	abstract void call();//abstact
}
abstract class iphone extends phone
{
	void vibrate ()
	{
		System.out.println("Vibrating.....");
	}
}
class windows extends iphone
{
	void call()
	{
		System.out.println("calling......");
	}
}
class Abstract 
{
	public static void main(String[] args) 
	{
		windows obj = new windows();
		obj.call();
		obj.vibrate();
		obj.ring();
	}
}
