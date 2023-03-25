/*overload main() method in 5 ways*/

class Overloading {

public void main(int a) {

System.out.println("Age "+a);

}
public void main(int a, String b) {

System.out.println("Age "+a);
System.out.println("Name "+b);

}
public void main(int a, String b, double c) {

System.out.println(a+" "+b+" "+c);

}
public void main(String b, int a) {
System.out.println(b+" "+a);

}
public void main(String b, double c) {

System.out.println(b+" "+c);

}
public static void main(String []args) {

	Overloading o = new Overloading();
		o.main(26);
		o.main(26,"Suresh");
		o.main(26,"ritik",80.2);
		o.main("alok",23);
		o.main("alok",85.3);	
}
}