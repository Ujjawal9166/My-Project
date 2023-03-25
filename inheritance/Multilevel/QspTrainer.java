class QspTrainer extends QspEmployee {

String subject;

public QspTrainer(String name,int age, int empid, double salary,String branch,String subject){
	
	super(name,age,empid,salary,branch);
	this.subject=subject;

}
public void print() {


super.print();
System.out.println("Subject name: "+subject);
}

}