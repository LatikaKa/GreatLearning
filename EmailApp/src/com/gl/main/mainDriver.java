package com.gl.main;
/**
 * 
 * @author Latika kadam desai
 *
 */

import java.util.Scanner;
import com.gl.entities.Employee;
import com.gl.interfaces.Icredentails;
import com.gl.service.CredentialService;

public class mainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Employee class
		Employee emp = new Employee("Latika","Kadam");
		
		// interface
		Icredentails cred = new CredentialService();
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int departNum =scan.nextInt();
		
		switch (departNum)
		{
		case 1:
			emp.setEmail(cred.generateEmailAddress(emp.getFirstName(), emp.getlastName(), "tech"));
			break;
		case 2:
			emp.setEmail(cred.generateEmailAddress(emp.getFirstName(), emp.getlastName(), "admin"));
			break;
		case 3:
			emp.setEmail(cred.generateEmailAddress(emp.getFirstName(), emp.getlastName(), "hr"));
			break;
		case 4:
			emp.setEmail(cred.generateEmailAddress(emp.getFirstName(), emp.getlastName(), "legal"));
			break;
			default:
				System.out.println("Invalid department email cannot be created.");		
		
		}
		
		emp.setPassword(cred.generatePassword());
		
		cred.showCredentails(emp);
		
		scan.close();
	}

}
