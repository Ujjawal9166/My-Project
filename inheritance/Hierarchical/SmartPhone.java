class SmartPhone extends Gadget {

	String cameracapacity;

public SmartPhone(String brand,double price,String cameracapacity){

	super(brand,price);
	this.cameracapacity=cameracapacity;


}
public void displaySmartPhone(){

System.out.println("Camera capacity: "+cameracapacity);
System.out.println("---------------");

}

}