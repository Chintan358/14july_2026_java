package A007_oops;

public class O009_Encaptulation {
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.setId(10);
		e.setName("Hello");
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		
		
		
	}
}
