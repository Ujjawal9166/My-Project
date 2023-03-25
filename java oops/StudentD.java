import java.util.Scanner;

class StudentD {

String name;
int id;
long contact;
int age;


public StudentD(int id, String name, long contact, int age)
{
this.id=id;
this.name=name;
this.contact=contact;
this.age=age;
}

public void display() {

System.out.println("Name"+name);
System.out.println("id"+id);
System.out.println("contact"+contact);
System.out.println("Age"+age);

}
public static void main(String []args) {
 
Scanner ob = new Scanner(System.in);

System.out.println("Enter your name");

String n = ob.next();
System.out.println("Enter ID");
int i = ob.nextInt();
System.out.println("Enter contact");
long c= ob.nextLong();
System.out.println("Enter your age");
int a= ob.nextInt();

StudentD s1= new StudentD(i,n,c,a);

s1.display();


}

}






