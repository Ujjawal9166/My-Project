/*wjp to find the sum numbers from 1 to 10*/

/*class Sumfor
{
public static void main(String[]args)
{
int sum=0;
for (int i=1; i<=10; i++)
{
sum=sum+i;
}
System.out.println("SUM OF THE NO B/W 1 TO 10 IS "+sum);

}
}*/

/*find the sum of all number from 10 to 30 that are devisible by 5
class Sumfor
{
public static void main(String[]args)
{
int sum=0;
for (int i=10; i<=30; i++)
{
if(i%5==0)
{
sum=sum+i;
}
}
System.out.println("SUM OF THE NO devisible by 5 from 10 TO 30 IS "+sum);
}
}*/

/*class Sumfor
{
public static void main(String []args)
{
int sum=0;
int i=1;
while(i<=10)
{
sum=sum+i;
i++;
}
System.out.println("SUM OF THE NO B/W 1 TO 10 IS "+sum);

}
}*/

class Sumfor
{
public static void main(String[]args)
{
int sum=0;
int i=10;
while(i%5==0)
{
sum=sum+i;
i++;
}

System.out.println("SUM OF THE NO devisible by 5 from 10 TO 30 IS "+sum);
}
}