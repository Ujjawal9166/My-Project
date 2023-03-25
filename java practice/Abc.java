import java.util.Scanner;

class Abc
{


public static String concat()
{

Scanner a1=new Scanner(System.in);

System.out.println("enter your First name");
String s1 =a1.nextLine();
System.out.println("enter your Last name");
String s2=a1.nextLine();
String s3=s1+s2;
return s3;
}


public static void main(String [] args)
{

System.out.println(concat());


}
}
