package thirdsemjavalab;
import java.util.Scanner;
class employee {
	private int id;
	private String name;
	private int salary;
	public employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int raiseSalary(int percent) {
		return this.salary+this.salary*percent/100;
	}
}
public class employee_demo {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int id;
		String name;
		int salary;
		System.out.println("enter employee id, name, salary");
		id=scanner.nextInt();
		name=scanner.next();
		salary=scanner.nextInt();
		employee employee=new	
		employee(id, name, salary);
		System.out.println("enter percent raise");
		int percent=scanner.nextInt();
		int raisedSalary=employee.raiseSalary(percent);
		System.out.println("raised salary:" +raisedSalary);
	}
}

		
		