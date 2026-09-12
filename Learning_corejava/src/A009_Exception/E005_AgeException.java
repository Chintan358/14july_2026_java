package A009_Exception;

class InvalidAgeExcepion extends Exception
{
	
}

class Agechecker
{
	public void getage(int age) throws InvalidAgeExcepion
	{
		if(age<18)
		{
			throw new InvalidAgeExcepion();
		}
		else
		{
			System.out.println("Valid age");
		}
	}
}

public class E005_AgeException {
	public static void main(String[] args) {
		
		Agechecker age = new Agechecker();
		try {
			age.getage(14);
		} catch (InvalidAgeExcepion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
