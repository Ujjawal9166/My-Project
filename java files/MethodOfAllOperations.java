class MethodOfAllOperations
{
public static void main(String []args)
{
int n=5;
System.out.println(addNum(n)+mulNum(n)+subNum(n)+modeNum(n)+divNum(n));
}
public static int addNum(int n)
{
return n+2;
}
public static int mulNum(int n)
{
return n*2;
}
public static int divNum(int n)
{
return n/2;
}
public static int subNum(int n)
{
return n-2;
}
public static int modNum(int n)
{
return n%2;
}
}