class Employee
{
	String name;
	int id;
	String Company;
	Employee(String name, int id,String Company)
	{
		this.name=name;
		this.id=id;
		this.Company=Company;
	}
	void Display()
	{
		System.out.println("ID : "+id+"\nNAME : "+name+"\nCompany : ");
	}
	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Yeshwant",302,"Rythmos");
		e1.Display();

	}
}
