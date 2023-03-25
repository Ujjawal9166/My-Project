import java.util.Scanner;
class Arrayleast
{
public static void main(String []main)
 {
	int a[]=new int[4];
	Scanner s= new Scanner(System.in);
	System.out.println("Enter element");
	for(int i=0;i<4;i++)
	{
	 a[i]=s.nextInt();
	 
	}
	System.out.println();
	int min=a[0];
	for(int i=0;i<4;i++)
     {
	if(a[i]<min)
	 min=a[i];
     }
	System.out.println("least element in array "+min);
  }

}