class Student1230QSP {

String name;
int age;
long contact;
int id;
static String batchcode="SCMA29";

public static void main(String []args) {
 
Student1230QSP s1 = new Student1230QSP("SAM",21,9998887770l,502);
Student1230QSP s2 = new Student1230QSP("ram",22,9998887771l,503);


s1.display();
s2.display();
}

public  void display() {

System.out.println(name);
System.out.println(age);
System.out.println(contact);
System.out.println(id);
System.out.println(batchcode);
}

public Student1230QSP(String n ,int a, long c, int i) {

name = n;
age = a;
contact = c;
id = i;
}
}

