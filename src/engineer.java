
public class engineer extends employee
{
	int overTime;
	
	public engineer()
	{
		
	}

	public engineer(String name, String address, String phone_no, String gender, int age, int salary, int overTime) 
	{
		super(name, address, phone_no, gender, age, salary);
		this.overTime = overTime ;
	}
	
	void display()
	{
		super.display();
		System.out.println("Over Time : "+ overTime);
	}


}
