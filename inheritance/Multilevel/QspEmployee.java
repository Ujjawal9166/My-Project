class QspEmployee extends TYEmployee {

String branch;


public QspEmployee(String name,int age, int empid, double salary,String branch) {

	super(name,age,empid,salary);
	this.branch=branch;

}
public void print(){
super.print();
System.out.println("Branch: "+branch);



}

}