import java.util.Scanner;

class StudentC {

String name;
int id;
long contact;
int age;


public StudentC()
{

Scanner ob = new Scanner(System.in);

System.out.println("Enter your name");

name = ob.next();

System.out.println("Enter ID");

id = ob.nextInt();

System.out.println("Enter contact");
contact = ob.nextLong();
System.out.println("Enter your age");
age = ob.nextInt();
}
public static void main(String []argd) {

StudentC s1 = new StudentC();
s1.display();
StudentC s2 = new StudentC();
s2.display();
}

public void display(){
System.out.println("Name "+name);
System.out.println("Id "+id);
System.out.println("Contact "+contact);
System.out.println("Age "+age);



}

}






