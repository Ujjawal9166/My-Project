class Stud
{
String name;
int age;

public void printInfo()
{
System.out.print(this.name);
System.out.println(" "+this.age);
}

public static void main(String args[])
{
Stud a1 = new Stud();
Stud a2 = new Stud();
Stud a3 = new Stud();


a1.name = "mahesh";
a1.age = 25;
a2.name = "ramesh";
a2.age = 26;
a3.name = "dinesh";
a3.age = 27;

a1.printInfo();
a2.printInfo();
a3.printInfo();



}
}
