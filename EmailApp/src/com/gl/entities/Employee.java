package com.gl.entities;

/**
 * 
 * @author Latika kadam desai
 *
 */

public class Employee {
private String firstName;
private String lastName;
private String email;
private String password;

public Employee(String firstName, String lastName)
{
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	
}

@Override
public String toString()
{
	
return "Employee Details \nfirstName=" + firstName + " \nlastName= " + lastName + "\nemail" + email + "\npassword" + password;
}
// firstName
public String getFirstName()
{
return firstName;	
}

public void setFirstName(String firstName)
{
this.firstName	= firstName;
}

// lastName
public String getlastName()
{
return lastName;	
}

public void setlastName(String lastName)
{
this.lastName	= lastName;
}

// email
public String getEmail()
{
return email;	
}

public void setEmail(String email)
{
this.email	= email;
}

// password
public String getPassword()
{
return password;	
}

public void setPassword(String password)
{
this.password	= password;
}

}
