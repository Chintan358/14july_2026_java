package A007_oops;


abstract class Abs
{
	//abstract
	public abstract void display();
	
	public void run()
	{
		System.out.println("run calling");
	}
}


class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("Display calling");
	}
	
}

public class O013_AbstractClass {
	public static void main(String[] args) {
		
		AbsImpl abs = new AbsImpl();
		abs.display();
		abs.run();
		
	}
}
