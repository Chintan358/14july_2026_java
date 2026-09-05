package oops;


class Pen
{
	//data member
	static int price = 20;
	String color = "Red";
	String company = "Cello";
	
	//function member
	void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		System.out.println("display calling...");
	}
	
}

public class O001_ClassDemo {
	public static void main(String[] args) {
		
		Pen.price = 500;
		
		Pen p1 = new Pen();
		p1.toWrite();
		
		
		Pen p2 = new Pen();
		p2.toWrite();
	
		
		Pen.display();
		
		O006_AccessModifier am = new O006_AccessModifier();
		// am.display();
	}
}
