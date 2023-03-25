class Student extends Person
{
int sid;

public Student(int age, String name,long contact,int sid)
{
super(age,name,contact);//This should be in 1st position only called as method chaining
this.sid=sid;
}
public void profile()
{

System.out.println("SID: "+sid);
}
public static void main(String []srgs)
{

Student s = new Student(26,"Ujjawal",9166467964l,101);
s.profile();
s.print();

}
}
