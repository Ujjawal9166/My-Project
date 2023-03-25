class Student {

String name;
float perc;
long contact;
int id;
static String batchcode="SCMA29";

public Student(int id, String name, long contact, float perc)
{
this.id=id;
this.name=name;
this.contact=contact;
this.perc=perc;
}

public Student(int id, String name, long contact)
{
this.id=id;
this.name=name;
this.contact=contact;
}

public Student(int id, String name)
{
this.id=id;
this.name=name;
}

public Student(long contact, int id)
{
this.contact=contact;
this.id=id;
}

public static void main(String []args) {
 
Student s1 = new Student(101,"SOHAN",9988776655l,85.2f);
Student s2 = new Student(102,"Rahul",8877665544l);
Student s3 = new Student(103,"shyam");
Student s4 = new Student(9988774433l,104);


s1.display();
s2.display();
s3.display();
s4.display();


}

public void display() {

System.out.println(id);
System.out.println(name);
System.out.println(contact);
System.out.println(perc);
System.out.println(batchcode);



}
}

