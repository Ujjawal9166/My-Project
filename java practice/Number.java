import java.util.Scanner;

class Number
{

public static boolean check()
{

Scanner ob=new Scanner(System.in);
System.out.println("enter the no");
int n=ob.nextInt();
if (n==100)
return true;
else
return false;
}

public static void main(String []args)
{
System.out.println(check());
}
}