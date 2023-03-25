/* wjp to perform arithmatic operations on 20 and 10 based on given operator symbol*/

class Operator
{
public static void main (String []args)
{
char symbol='*';
switch(symbol)
{
case '-':
System.out.println(20-10);
break;
case '+':
System.out.println(20+10);
break;
case '*':
System.out.println(20*10);
break;
case '/':
System.out.println(20/10);
break;
case '%':
System.out.println(20%10);
break;
default:
System.out.println("invalid");
}
System.out.println("okay");
}
}