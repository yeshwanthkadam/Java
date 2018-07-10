class Employee
{
	String name;
	int id;
	public static final String COMPANY = "RYTHMOS";
	Employee(String n, int i)
	{
		name=n;
		id=i;
	}
	void Display()
	{
		System.out.println("ID : "+id+"\nNAME : "+name+"\nCompany : "+COMPANY);
	}
	public static void main(String[] args) 
	{
		System.out.println(name);
		Employee e1 = new Employee("Yeshwant",302);
		e1.Display();
		Employee e2 = new Employee("Naveen",202);
		e2.Display();

	}
}
