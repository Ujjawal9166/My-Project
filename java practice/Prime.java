import java.util.Scanner;

class prime
{

public static String check()
{

Scanner ob=new Scanner(System.in);
System.out.println("enter the no");
int n=ob.nextInt();
boolean b=false;
for(int i=2; i<n; i++)
{
if (n%i==0)
{
b=true;
}
}

if(b==true)
{
return "prime";
}
else
{
return "not prime";
}
}
 
public static void main(String[] args)
{
System.out.println(check());


}
}