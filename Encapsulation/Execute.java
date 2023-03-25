class Execute
{

public static void main(String []args)
{
Abc ob = new Abc();
System.out.println(ob.getX());
System.out.println(ob.getY());
System.out.println(ob.getZ());

ob.setX();
ob.setY();
ob.setZ();

System.out.println(ob.getX());
System.out.println(ob.getY());
System.out.println(ob.getZ());

}

}