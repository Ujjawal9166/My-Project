class Executeswitch
{
	public static void main(String[] args)
	{

	Eswitch s= new Bulb("syska",110);
	s.switchOn();
	
	Bulb b=(Bulb)s;
	b.printDetails();
     s.switchOff();

	Eswitch s1=new AC("SAMSUNG",32000);
	s1.switchOn();
	
	AC a=(AC)s1;
	a.printAcDetails();
     s1.switchOff();
}


}