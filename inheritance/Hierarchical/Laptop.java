class Laptop extends Gadget {

	String processor;

public Laptop(String brand,double price,String processor){

	super(brand,price);
	this.processor=processor;

}
public void displayLaptop(){

	System.out.println("Processor: "+processor);
	System.out.println("---------------");


}

}