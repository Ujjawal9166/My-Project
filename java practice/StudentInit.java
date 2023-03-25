class StudentInit {

int age;
String name;

static
{
System.out.println("Hello");
}

{
System.out.println("Your details are stored successfully");
}


public void print()
{

System.out.println(name);
System.out.println(age);
}

public StudentInit(int age, String name)
{
this.name = name;
this.age = age;
}


public static void main(String []args) {



StudentInit a1 = new StudentInit(27,"Shubham");
a1.print();


StudentInit a2 = new StudentInit(31,"Shubha");
a2.print();
}
}


