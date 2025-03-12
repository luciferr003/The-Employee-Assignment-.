
public class salesPerson extends employee
{
	int comission ;

	public salesPerson(String name, String address, String phone_no, String gender, int age, int salary, int comission) 
	{
		super(name, address, phone_no, gender, age, salary);
		this.comission = comission ;
	}
	
	void display()
	{
		super.display();
		System.out.println("Comission : "+ comission);
	}

}
