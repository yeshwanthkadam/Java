class Student 
{
	String name;
	int id;
	String sec;
	Student(String name, int id, String sec)
	{
		this.name=name;
		this.id=id;
		this.sec=sec;
	}
	void Display()
	{
		System.out.println("Name = "+name+"\nid is = "+id+"\nsection is = "+sec);
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Student s1 = new Student("Yeshwant", 86, "A");
		s1.Display();
		Student s2 = new Student("Kadam", 86, "B");
		s2.Display();
	}
}
