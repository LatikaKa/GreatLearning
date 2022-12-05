package com.gl.interfaces;

import com.gl.entities.Employee;

/**
 * 
 * @author Latika kadam desai
 *
 */
public interface Icredentails {
	public String generatePassword();
	public String generateEmailAddress(String firstName, String lastName, String departmentName);
	
	void showCredentails(Employee emp);
}
