import java.util.Scanner;

class Practice
{
String name;
int age;
long contact;

public Practice()
{
Scanner s = new Scanner(System.in);

System.out.print("Enter your name: ");
name = s.nextLine();

System.out.print("Enter your age: ");
age = s.nextInt();

System.out.print("Enter your contact: ");
contact = s.nextLong();
}
public void display()
{
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Contact: "+contact);
}
public static void main(String []aggs)
{
Practice p = new Practice();
Practice p1 = new Practice();

p.display();
p1.display();
}
}


