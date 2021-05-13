
class Employee{
	private int id;// instance varaible 
	private String name;// instance varaible 
	private double salary;// instance varaible 
	private static String companyName="ibm";// static data

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		//this(1,"raj",77);
		System.out.println("default ctr");
	}

	public Employee(int id, String name, double salary) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	public void printDetails() {
		System.out.println("---------------------");
		System.out.println("id: " + id);
		System.out.println("nane: " + name);
		System.out.println("salary: " + salary);
		System.out.println("companyName: " + companyName);	
		System.out.println("---------------------");
	}
	
}
public class DemoEmployee {

	public static void main(String[] args) {
		Employee employee=new Employee(43, "raj", 43);
	
		employee.printDetails();
		
		
		Employee employee2=new Employee(3, "suman", 43);
		
		employee2.printDetails();
		
		
		
	}
}













