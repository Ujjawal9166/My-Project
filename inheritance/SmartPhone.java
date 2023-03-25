class SmartPhone extends Phone {

String cameraCapacity;

	public SmartPhone(String brand,double price,String cameraCapacity){

	super(brand,price);
	this.cameraCapacity=cameraCapacity;
   }
	public void view(){

	System.out.println("Camera Capacity- "+cameraCapacity);
   }

	public static void main(String []args) {

	SmartPhone s= new SmartPhone("Nothing",25000,"45.2 MP");
	SmartPhone s1= new SmartPhone("samsung",35000,"48MP");
	System.out.println("Mobile description");
	s.print(); 
	s.view(); s1.print(); s1.view();
	
  }

}
