//method calling 

import java.util.Scanner;
class Multi
{
int a;
int b;

public Multi()
{
Scanner sc= new Scanner(System.in);

System.out.print("enter 1st value: ");

a=sc.nextInt();

System.out.print("Enter 2nd value: ");

b=sc.nextInt();
}
public void display()
{
System.out.println("result is: "+a*b);
}
public static void main(String []args)
{
Multi m = new Multi();
m.display();
}
}