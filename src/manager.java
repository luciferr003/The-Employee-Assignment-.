
public class manager extends employee 
{
	float hra;

	public manager(String name, String address, String phone_no, String gender, int age, int salary, float hra) 
	{
		super(name, address, phone_no, gender, age, salary);
		this.hra = hra;
	}
	
	@Override
	void display()
	{
		super.display();
		System.out.println("Over Time : "+ hra);
	}	
	
}
