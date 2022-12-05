package com.gl.service;
import com.gl.interfaces.Icredentails;


import java.util.Random;

import com.gl.entities.Employee;

/**
 * 
 * @author Latika kadam desai
 *
 */

public class CredentialService implements Icredentails {
@override
public String generatePassword() {
	String capsChar = "ABCEDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallChar ="abcdefghijklmnopqrstuvwxyz";
	String splChar = "@$%&_!*^><.,;";
	String numChar ="1234567890";
	
	StringBuffer rtnValue = new StringBuffer();
	
	Random randomCl = new Random();
	int rand = randomCl.nextInt(capsChar.length());
	rtnValue.append(capsChar.charAt(rand));
	
	rand = randomCl.nextInt(smallChar.length());
	rtnValue.append(smallChar.charAt(rand));
	
	rand = randomCl.nextInt(splChar.length());
	rtnValue.append(splChar.charAt(rand));
	
	rand = randomCl.nextInt(numChar.length());
	rtnValue.append(numChar.charAt(rand));
	
	for(int index=0; index<6; index++)
	{
	rand = randomCl.nextInt(4);
		switch(rand) {
		case 0:
			rand= randomCl.nextInt(capsChar.length());
			rtnValue.append(capsChar.charAt(rand));
			break;
		case 1:
			rand= randomCl.nextInt(smallChar.length());
			rtnValue.append(smallChar.charAt(rand));
			break;
		case 2:
			rand= randomCl.nextInt(splChar.length());
			rtnValue.append(splChar.charAt(rand));
			break;
		case 3:
			rand= randomCl.nextInt(numChar.length());
			rtnValue.append(numChar.charAt(rand));
			break;
		
		}
		
	}
	
	return rtnValue.toString();
	
}

@Override
public String generateEmailAddress(String firstName, String lastName, String departmentName) {
	return firstName.toLowerCase() + lastName.toLowerCase() + "@" + departmentName + ".greatlearning.com";
	
}

@Override
public void showCredentails(Employee emp)
{
	System.out.println(emp);
}
}
