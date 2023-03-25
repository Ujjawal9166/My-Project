import java.util.Scanner;

class Account
{
long acno;
private int pin;
private double balance;
private long contact;

public Account(long acno, int pin, double balance, long contact)
{
this.acno=acno;
this.pin=pin;
this.balance=balance;
this.contact=contact;
}
public void setPin()
{
Scanner s= new Scanner(System.in);
System.out.print("Enter the Exhisting Pin: ");
int p=s.nextInt();

if(p==pin)
{
System.out.print("Enter the new Pin: ");
 pin=s.nextInt();
System.out.println("Pin updated successfully");

} 

else
{
System.out.println("YOU HAVE ENTERED WRONG PASSWORD");
}
}

public void setContact()
{
Scanner s = new Scanner(System.in);
System.out.print("Enter exhisting contact: ");
 long c= s.nextLong();

if(c==contact)
{
System.out.print("Enter new contact: ");
contact=s.nextLong();
System.out.println("contact updated successfully");
}
else
{
System.out.println("you have entered wrong contact");
}
}

public void getBalance()
{
Scanner s= new Scanner(System.in);
System.out.print("Enter the pin: ");
int p = s.nextInt();

if(p==pin)
{
System.out.println("YOUR BALANCE IS: "+balance);
}
else
{
System.out.println("You have entered wrong password");
}
}
}