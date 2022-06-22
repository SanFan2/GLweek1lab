package com.gl.driver;
import java.util.Scanner;
import com.gl.model.Employee;
import com.gl.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee ("Suman", "Raghavan");
		
		CredentialService cService = new CredentialService();
		String generatedEmail;
		char[]generatedPasswd;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Credential System");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		int choice;
		System.out.println("Enter Your Choice");
		choice = scan.nextInt();
		if(choice ==1)
		{
			generatedEmail = cService.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"Tech");
			
			generatedPasswd = cService.generatePassword();
			
			cService.displayCredentials(employee, generatedEmail, generatedPasswd);
			
		}
		
		else if (choice ==2)
		
		
		{
			generatedEmail = cService.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"Admin");
			
			generatedPasswd = cService.generatePassword();
			
			cService.displayCredentials(employee, generatedEmail, generatedPasswd);
			
		}
		else if (choice ==3)

		{
			generatedEmail = cService.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"HR");
			
			generatedPasswd = cService.generatePassword();
			
			cService.displayCredentials(employee, generatedEmail, generatedPasswd);
			
		}
		
		else if (choice ==4)


		
		{
			generatedEmail = cService.generateEmail(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"Legal");
			
			generatedPasswd = cService.generatePassword();
			
			cService.displayCredentials(employee, generatedEmail, generatedPasswd);
			
		}
	
	
	}
	
}

