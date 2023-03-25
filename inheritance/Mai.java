class Mai {

String name;
int age;
String firstname;
String lastname;
String nickname;

public Mai(String name,int age,String firstname,String lastname, String nickname){

this(name,age,firstname,lastname);
this.nickname=nickname;

 }

public Mai(String name,int age,String firstname,String lastname){

	this(name,age,firstname);
	this.lastname=lastname;
}
public Mai(String name,int age, String firstname){

	this(name,age);
	this.firstname=firstname;
}
public Mai(String name,int age){

	this(name);
	this.age=age;
}
public Mai(String name){
	this();
	this.name=name;
System.out.println("lale di jaan");
}
public Mai(){

	System.out.println("welcome");
}
public void print(){
	System.out.println("Full name: "+name);
	System.out.println("Age: "+age);
	System.out.println("First name: "+firstname);
	System.out.println("Last name: "+lastname);
	System.out.println("Nick name: "+nickname);
}

}
