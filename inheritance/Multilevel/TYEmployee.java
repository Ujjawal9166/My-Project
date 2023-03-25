class TYEmployee {

	String name;
	int age;
	int empid;
	double salary;

public TYEmployee(String name,int age, int empid, double salary) {

	this.name=name;
	this.age=age;
	this.empid=empid;
	this.salary=salary;

}
public void print() {

	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Emp id: "+empid);
	System.out.println("Salary: "+salary);
}
	

}