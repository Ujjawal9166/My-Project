class Car extends vehicle
{
public void display()
{
System.out.println("Here is onthor car");
}
public static void main(String []srgs)
{
vehicle a = new vehicle();
a.view();

Car c = new Car();
c.display();
a.view();
}
}
