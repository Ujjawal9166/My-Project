/*wjp to create a class children
   
   name
   age
   std
   create a contructor with 3 menthod
   create a method detailsOf Children()*/

class Children {

String name;
int age;
int std;
static String wish="Happy Childrens day";

public static void wish() {
System.out.println("happy children day");
}

public static void main(String []args) {

wish();

Children c1 = new Children("bholu",5,2);
Children c2 = new Children("golu",4,3);
Children c3 = new Children("shyam",5,2);

c1.detailsOfChildren();
c2.detailsOfChildren();
c3.detailsOfChildren();
}
public void detailsOfChildren()
{
System.out.println("name "+name);
System.out.println("age "+name);
System.out.println("std "+name);
}
public Children(String name,int age,int std) {

this.name=name;
this.age=age;
this.std=std;

}
}

