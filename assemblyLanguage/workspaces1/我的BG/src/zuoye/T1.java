package zuoye;

public class T1 {
	public static void main(String[] args) {
		Employee emp;
		 emp=new Employee("查明国","八月");
		System.out .println(emp.getSalary(8));
		System.out.println("\n");
		
		SalariedEmployee emp1=new SalariedEmployee(6000);
		System.out .println(emp1.Salar1(6000));
		System.out.println("\n");
		
		SalesEmployee emp2=new SalesEmployee(60000,0.2);
		System.out.println(emp2.Salar3(60000.0,0.2));
		System.out.println("\n");
		
		HourlyEmployee emp3=new HourlyEmployee(25.0,165.0);
		System.out.println(emp3.Salar2(25,165));
		System.out.println(emp3.Salar2(25,120));
		System.out.println("\n");
		
		BasePlusSalesEmployee emp4=new BasePlusSalesEmployee(5000);
		System.out .println(emp4.Salar4(60000, 0.3, 5000));
		
	}

}
