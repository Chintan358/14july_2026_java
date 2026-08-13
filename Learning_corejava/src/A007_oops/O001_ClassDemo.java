package A007_oops;

class Pen
{
	//data member
	static int price;
	String color;
	String company;
	
	//function member
	void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	static void display()
	{
		System.out.println("display calling");
	}
}

public class O001_ClassDemo {
	public static void main(String[] args) {
		
		Pen.price=50;
		
		Pen p1 = new Pen();
		p1.color="RED";
		p1.company="CEllo";
		p1.toWrite();
	
		
		Pen p2 = new Pen();
		p2.color="BLACK";
		p2.company="SS";
		p2.toWrite();
		
		Pen.display();
		
	}
}
