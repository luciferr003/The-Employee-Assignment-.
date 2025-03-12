
public class Entry 
{
	
	void input ()
	{
		
	}

	public static void main(String[] args) 
	{
		int choice = 0 ;
		String name ;
		String Address ;
		String phone_no ;
		String gender ;
		int age ;
		int salary ;
		
		float hra ;
		int overTime ;
		int comission ;
		
		employee objEmployee ;
		manager objManager ;
		engineer objEngineer ;
		salesPerson objSalesPerson ;
		
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
				case 1:  // Add an Employee
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
									case 1: // Manager
										
										System.out.println("Enter the Employee Name : ");
										name = consoleInput.getString();
										
										System.out.println("Enter the Employee Address : ");
										Address = consoleInput.getString();
										
										System.out.println("Enter the Employee Phone no. : ");
										phone_no = consoleInput.getString();
										
										System.out.println("Enter the Employee Gender : ");
										gender = consoleInput.getString();
										
										System.out.println("Enter the Employee Age : ");
										age = consoleInput.getInt();
										
										System.out.println("Enter the Employee Salary : ");
										salary = consoleInput.getInt();
										
										System.out.println("Enter the Employee  : ");
										hra = consoleInput.getFloat();

										
										objManager = new manager(name, Address, phone_no, gender, age, salary, hra) ;
										objManager.display();
										break;
										
									case 2: // Engineer
										
										System.out.println("Enter the Employee Name : ");
										name = consoleInput.getString();
										
										System.out.println("Enter the Employee Address : ");
										Address = consoleInput.getString();
										
										System.out.println("Enter the Employee Phone no. : ");
										phone_no = consoleInput.getString();
										
										System.out.println("Enter the Employee Gender : ");
										gender = consoleInput.getString();
										
										System.out.println("Enter the Employee Age : ");
										age = consoleInput.getInt();
										
										System.out.println("Enter the Employee Salary : ");
										salary = consoleInput.getInt();
										
										System.out.println("Enter the Over Time : ");
										overTime = consoleInput.getInt();
										
										objEngineer = new engineer(name, Address, phone_no, gender, age, salary, overTime) ;
										objEngineer.display();
										break ;
										
		                            case 3: // Sales person
		                            	
		                            	System.out.println("Enter the Employee Name : ");
										name = consoleInput.getString();
										
										System.out.println("Enter the Employee Address : ");
										Address = consoleInput.getString();
										
										System.out.println("Enter the Employee Phone no. : ");
										phone_no = consoleInput.getString();
										
										System.out.println("Enter the Employee Gender : ");
										gender = consoleInput.getString();
										
										System.out.println("Enter the Employee Age : ");
										age = consoleInput.getInt();
										
										System.out.println("Enter the Employee Salary : ");
										salary = consoleInput.getInt();
										
										System.out.println("Enter the Comission : ");
										comission = consoleInput.getInt();
										
										objSalesPerson = new salesPerson(name, Address, phone_no, gender, age, salary, comission) ;
										objSalesPerson.display();
										break;
										
		                            case 4: // Exit
		                            	break ;
		                            
										
								}
						}
					
					
				case 2:
					objEmployee = new employee();
					objEmployee.display();
			}
			
		}
	}

}



























