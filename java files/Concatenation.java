class Concatenation
{
public static void main(String []args)
{ 
/*int a=20;
int b=40;
int c=10;

int result = (a>b)?((a>c)?a:c):((b>c)?b:c);

System.out.println(result+" is greater");*/

int a=20;
int b=40;
int c=10;

if(a<b)
{
       if(a<c)
               System.out.println(a+" is greater");
       else
               System.out.println(c+" is greater"); 
}
   else
       {
        if(b>c)
               System.out.println(b+" is greater");

        else
               System.out.println(c+" is greater");
}
}
}
  

