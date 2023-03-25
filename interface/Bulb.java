class Bulb implements Eswitch
{
String brand;
double price;

public void printDetails()
{
System.out.println("Brand "+brand);
System.out.println("Price "+price);
}
public void switchOn()
{
System.out.println("Please On the bulb");
}
public void switchOff()
{
System.out.println("Please Off the bulb");
}
public Bulb(String brand,double price)

{
this.brand=brand;
this.price=price;
}

}