class MethodOverload
{
public static void main(String []args)
{
mul('U');
mul(20,30);
mul(10,20,30);
}
public static void mul(char a)
{
System.out.println(a);
}
public static void mul(int a ,int b)
{

System.out.println(a+b);
}

public static void mul(int a,int b, int c)
{

System.out.println(a+b*c);
}
}
