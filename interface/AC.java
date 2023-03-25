class AC implements Eswitch
{
String brand;
double price;
public void printAcDetails()
{
System.out.println("Brand of AC IS "+brand);
System.out.println("PRICE OF AC IS "+price);
}
public void switchOn()
{
System.out.println("Please On the AC");
}
public void switchOff()
{
System.out.println("Now Please OFF the AC");
}
public AC(String brand, double price)
{
this.brand=brand;
this.price=price;
}

}