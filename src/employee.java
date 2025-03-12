
public class employee 
{
	
	String name ;
	String address ;
	String phone_no ;
	String gender ;
	int age ;
	int salary ;
	
	public employee()
	{
		
	}

	public employee(String name, String address, String phone_no, String gender, int age, int salary) 
	{
		this.name = name ;
		this.address = address ;
		this.phone_no = phone_no ;
		this.gender = gender ;
		this.age = age ;
		this.salary = salary ;
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(phone_no);
		System.out.println(gender);
		System.out.println(age);
		System.out.println(salary);
	}
	
	

}
