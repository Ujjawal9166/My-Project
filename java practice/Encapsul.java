import java.util.Scanner;
class Encapsul
{
   private String name;
   private int age;
   private long contact;
   private long password;
public Encapsul(String name, int age, long contact,long password)
{ 
    this.name=name;
    this.age=age;
    this.contact=contact;
    this.password=password;
}
 public void setContact()
 {
  Scanner s=new Scanner(System.in);
  System.out.print("Enter your exhisting contcat number : ");
  long c=s.nextLong();
  if(c==contact)
   {
   System.out.print("enter your new contact number : ");
    contact=s.nextLong();
   }  
  else{
   System.out.print("Wrong number");
     }
 }
public void getAge()
{
  Scanner s=new Scanner(System.in);
  System.out.print("Enter your password : ");
  long p=s.nextLong();
  if(p==password)
  {
  System.out.println("Your age is :"+age);
  }
  else
  {
  System.out.println("wrong password");
   }

}

}