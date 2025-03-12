
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
		System.out.println("Name : " +name);
		System.out.println("Address : "+address);
		System.out.println("Phone no : "+phone_no);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
	
	

}
