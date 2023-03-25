import java.util.Scanner;

class Char//ASCII VALUEs
{
public static void main(String []args)

{

Scanner s=new Scanner(System.in);

System.out.println("enter the character");
char ch;

ch=s.next().charAt(0);

int n= ch;


System.out.println("ASCII VALUE OF "+ch+" IS "+n);

}
}

