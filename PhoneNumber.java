/**
* Example using conditions
*/

public class PhoneNumber
{
	//**************************
	// Field Variable
	// Stores phone number
	private String phoneNumber;
	
	//**************************
	// Constructor
	// Constructs the object PhoneNumber and initializes as 100-100-1000.
	public PhoneNumber()
	{
		phoneNumber = "100-100-1000";
	}
	
	//**************************
	// Methods
	// Lets the user insert a phone number
	public void changeNumber(int num1, int num2, int num3)
	{
		// If area code is wrong, tell user to input something else
		if (num1 < 100 || num1 > 999)
		{
			System.out.println("Invalid area code!");
			phoneNumber = "100-100-1000";
		}
		phoneNumber = num1 + "-" + num2 + "-" + num3;
	}
	
}