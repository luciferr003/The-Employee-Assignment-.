
public class Entry 
{

	public static void main(String[] args) 
	{
		int choice = 0 ;
		String name ;
		String Address ;
		String phone_no ;
		byte gender ;
		int age ;
		int salary ;
		
		while(true)
		{
			System.out.println();
			System.out.println("1. Add an Employee");
			System.out.println("2. Display");
			System.out.println("3. Sort");
			System.out.println("4. Save to File");
			System.out.println("5. Load form file");
			System.out.println("6. Exit");
			System.out.println();
			
			System.out.println("Enter your Choice : ");
			choice = consoleInput.getInt();
			
			switch(choice)
			{
				case 1:
					while(true)
					{
						System.out.println();
						System.out.println("1. Manager");
						System.out.println("2. Engineer");
						System.out.println("3. Sales Person");
						System.out.println("4. Exit to main Menu");
						System.out.println();
						
						System.out.println("Enter your Choice : ");
						choice = consoleInput.getInt();
						
						switch(choice)
						{
							case 1:
								
								System.out.println("Enter the Employee Name : ");
								name = consoleInput.getString();
								
								System.out.println("Enter the Employee Address : ");
								Address = consoleInput.getString();
								
								System.out.println("Enter the Employee Phone no. : ");
								phone_no = consoleInput.getString();
								
								System.out.println("Enter the Employee Gender : ");
								gender = consoleInput.getByte();
								
								System.out.println("Enter the Employee Age : ");
								age = consoleInput.getInt();
								
								System.out.println("Enter the Employee Salary : ");
								salary = consoleInput.getInt();
								
								employee objEmployee = new employee(name, Address, phone_no, gender, age, salary) ;
						}
					}
					
				case 2:
					employee objEmployee = new employee();
					objEmployee.display();
			}
			
		}
	}

}



























