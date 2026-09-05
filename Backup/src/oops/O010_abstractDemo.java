package oops;

abstract class Abs
{
	public abstract void sample();
	
	public void display()
	{
		System.out.println("display calling");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void sample() {
		System.out.println("Sample calling from AbsImpl");
	}
	
}

public class O010_abstractDemo {
	public static void main(String[] args) {
		
	//	Abs ab = new Abs();
		
		AbsImpl abs = new AbsImpl();
		abs.sample();
	}
}
