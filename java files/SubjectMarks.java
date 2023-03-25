/*wjp to find total mark of 3 subject marks find percentage(each mark should be floting point
value total mark is 300)
print total mark
print percentage
3 subject marks should be passed from caller*/

class SubjectMarks
{
public static void main(String []args)
{
float a=75.25f;
float b=68.48f;
float c=89.46f;
calculate(a,b,c); //method calling statement ith actual arg

}
public static void calculate(float a,float b,float c) //here 3 formal arg
{

float total=(a+b+c);

System.out.println("Total marks is "+total);

findPercentage(total);
}
public static void findPercentage(float total)
{
float percentage=(total/300)*100;

System.out.println("Percentage is "+percentage);
}

}
	