package com.wipro.exceptionhandling;
class InvalidCountryException extends Exception{
public InvalidCountryException(String s)
{
	super(s);
}
public static class UserRegistration {

	public static void main(String[] args)
{
	UserRegistration in=new UserRegistration();
	in.registerUser("chandana","india");
	in.registerUser("venkatesh","uk");
}
void registerUser(String name,String country)
{
	if(!country.equals("india"))
	{
		try
		{
			throw new InvalidCountryException("User Outside india cannot be registered");
		}
		catch(InvalidCountryException ex)
		{
			System.out.println("caught");
			System.out.println(ex.getMessage());
		}
	}
	else
	{
		System.out.println("User registration done Successfully");
	}
	
}
}

}