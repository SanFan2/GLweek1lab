package com.gl.service;

import java.util.Random;

import com.gl.model.Employee;

public class CredentialService {

	public char[] generatePassword()
	{
		String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters= "abcdefghijklmnopqrstuvwxyz";
		String numbers= "0123456789";
		String specialCharacters= "@_!#$%^&*()<>?/\\|}{~:]";
		
		String values = capitalLetters + lowerCaseLetters + numbers + specialCharacters;
		
		Random random = new Random();
		char password[] = new char[8];
		for(int i=0;i<8; i++)
		{
			password[i] = values.charAt(random.nextInt(values.length()));
		}
			return password;
				
	}
		
	
public String generateEmail(String firstName, String lastName, String department)
{
	String email = firstName+lastName+ "@" + department+ ".greatlearning.com";
	return email;

}

public void displayCredentials (Employee employee, String generatedEmail, char[] generatedPassword)

{
	System.out.println("Hello "+employee.getFirstName());
	System.out.println("Your eMail "+generatedEmail);
	System.out.println("Your Password "+generatedPassword);


}



}