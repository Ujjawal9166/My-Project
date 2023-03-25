class GadgetExecute {

public static void main(String []args){

SmartPhone s = new SmartPhone("Samsung",1500.0,"48 mp");
	s.displayGadget();
	s.displaySmartPhone();

Laptop l= new Laptop("Lenevo",36000.2,"I7");
	l.displayGadget();
	l.displayLaptop();

Gadget g = new Gadget("Nokia",26000.3);
	g.displayGadget();
}


}