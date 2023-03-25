class Vo extends Mai {

String sname;
int sage;

	public Vo(String name,int age,String firstname,String lastname, String nickname,String sname,int sage){

	super(name,age,firstname,lastname,nickname);
	this.sname=sname;
	this.sage=sage;
}
	public void view(){

	System.out.println("Name: "+sname);
	System.out.println("Age: "+sage);
}
	public static void main(String []args){

	Vo v= new Vo("Shubham",30,"Subh","labh","Subbu","Rani",20);

	v.print();
	v.view();
}

}