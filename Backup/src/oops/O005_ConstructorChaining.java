package oops;
class p
{
	
	p()
	{
		
		System.out.println("p calling..");
	}
	 
}
class q extends p
{
	q(int a)
	{
		this();
		System.out.println("id : "+a);
	}
	q()
	{
		super();
		System.out.println("Q calling");
	}

}
class r extends q
{
	r()
	{
		super(10);
		System.out.println("r calling ");	
	}
}



public class O005_ConstructorChaining {
	public static void main(String[] args) {
		
		r l = new r();
		
	}
}
