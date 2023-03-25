class Factorial
{
public static void main(String []args)
{
int num = 6;

long factorial = mulNumbers(num);

System.out.println("Factorial of" +num+ "=" +factorial);
}

public static long mulNumbers(int num)
{
if(num>=1)

return num*mulNumbers(num-1);

else

return 1;

}
}
