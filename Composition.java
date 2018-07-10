class Composition 
{
	public static void main(String[] args) 
	{
		Room r= new Room("BedRoom");
		r.colour="Blue";
		r.length= 100;
		r.f=new Fan("Crompton");
		r.f.speed=100;
		r.f.colour="Red";
		r.l=new Light("Tube Light");
		r.l.colour="White";
		r.l.watts=500;
		System.out.println("Name of the fan : " +r.f.name+"\nName of the room : " +r.name+"\nLength of the room : "+r.length);
	}
}
class Fan
{
	String name;
	int speed;
	String colour;
	Fan(String name){
		this.name=name;}
}
class Light
{
	String name;
	String colour;
	int watts;
	Light(String name){
		this.name=name;}
}
class Room
{
	String name;
	String colour;
	int length;
	Fan f;
	Light l;
	Room(String name){
		this.name = name;}
}
