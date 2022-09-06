import java.util.Scanner;

public class Poised {
    public static void main(String[] args){

        int projectNum;
        String projectName;
        String building;
        int erfnum;
        double paid;
        double totalCost;
        int date;

        
        System.out.println("HELLO AND WELCOME TO POISED");                  // welcoming the user

        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter project number: ");
        projectNum = scanner.nextInt();

		Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter the project name: ");
        projectName = scanner1.nextLine();

		Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the type of building: ");
        building = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
		System.out.println("Please enter erf number: ");
        erfnum = scanner3.nextInt();
        
		Scanner scanner4 = new Scanner(System.in);
        System.out.println("Please enter amount that has been paid: ");
        paid = scanner4.nextDouble();
        
		Scanner scanner5 = new Scanner(System.in);
        System.out.println("Please enter total amount to be paid: ");
        totalCost = scanner5.nextDouble();
       
		Scanner scanner6 = new Scanner(System.in);
        System.out.println("Please enter the deadline for the project YYYY/MM/DD: ");
        date = scanner6.nextInt();
        
       
        Project newProject = new Project(projectNum, projectName, building, erfnum, paid, totalCost,
            date);

        System.out.println("Project successfully added!");

        System.out.println(newProject.DisplayProject());
        
        
        System.out.println("PLEASE CHOOSE FROM THE FOLLOWING OPTIONS :" +
            "\n1) EDIT PROJECT\n 2) UPDATE CONSTRACTOR'S DETAILS\n 3) FINALISE THE PROJECT\n 4) EXIT");        // The Main menu
        int choice = scanner.nextInt();
    
        if (choice  == 1)
			{	
		
				System.out.println("Would you like to:" + 
						"\n1. Edit due date" +
						"\n2. Edit the total amount paid?");
				
				
				int editChoice = scanner.nextInt();
				
				if (editChoice == 1)  // If they choose 1. 
				{	
					
					System.out.println("\nPlease enter a new due date for the project: ");
					date = scanner.nextInt();  
					
					// New project object created to include the new due date value.
					Project projectEdit = new Project(projectNum, projectName, building, erfnum, paid, totalCost,
                        date);
					System.out.println(projectEdit.DisplayProject());  // Edited project object displayed.
					
				}
				else if (editChoice == 2)  // If they choose 2.
					
					
					System.out.println("\nPlease enter a new total amount of the fee paid to date: ");
					paid = scanner.nextDouble();
					
					
					Project projectEdit2 = new Project(projectNum, projectName, building, erfnum, paid, totalCost,
                        date);
					System.out.println(projectEdit2.DisplayProject());  // Edited project object displayed. 
			}
			
			else if (choice == 2)  // If they choose 2 from the menu.
			{	

				System.out.println("\nPlease enter the contractor's name to confirm their details: ");  // name.
				String name = scanner.nextLine();
				
				System.out.println("\nPlease enter the contractor's new contact number: ");  // Contact number.
				int number = scanner.nextInt();
				
				System.out.println("\nPlease enter the contractor's new email address: ");  // Email address.
				String email = scanner.nextLine();
				
				System.out.println("\nPlease enter the contractor's new physical address: ");  // Physical address.
				String address = scanner.nextLine();
				
				
				Constractor contractorEdit = new Constractor(name, number, email, address);
				
				System.out.println("Your contractor details have been update successfully. \n");
				System.out.println(contractorEdit.DisplayConstractor());	
				
			}
			
		else if (choice == 3)  // If they choose option 3 from the menu.
			{
				if (totalCost == paid)  // If they have already paid the project fee in full.
				{	
					System.out.println("The project has been paid in full. No invoice generated.");
					System.out.println("Please add a completion date for this project: ");
					
					
				}
				
				else if (totalCost != paid)  // If the customer has not yet paid in full.
				{	
					System.out.println("Your invoice will be generated with the following details: ");
					
                    System.out.println("\nPlease enter the customer's full name: ");
					String name = scanner.nextLine();
					
					
					System.out.println("\nPlease enter the customer's contact number: ");
					int number = scanner.nextInt();
					
					System.out.println("\nPlease enter the customer's email address: ");
					String email = scanner.nextLine();
					
					System.out.println("\nPlease enter the customer's physical address: ");
					String address = scanner.nextLine();
					
					
					System.out.println("Please add a completion date for this project: ");
					
					String completion2 = scanner.nextLine();  // Completion date stored in string variable.
					String finalise2 = "Succussful";
					
					
					Customer customer1 = new Customer(name, number, email, address);
					System.out.println("\nPlease view your invoice details below: ");
					
					
					System.out.println(customer1.DisplayCustomer());
					System.out.println("\nAmount still owed: R" + (totalCost - paid) + "\n");
					
					// the finalised status of the project.
					System.out.println(newProject.DisplayProject() + "\nCompletion Date: " + completion2);
					System.out.println("Project status: " + finalise2);
					
				}
			}
		
		if (choice == 4)  // If the user chooses 4 from the menu.
		{	
			// Successful logout message.
			System.out.println(" THANK YOU. GOODBYE!");
		}
		
	}

}
        