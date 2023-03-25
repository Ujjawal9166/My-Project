class Phone {
  String brand;
  double price;
	
	public Phone(String brand,double price){
	
	this.brand=brand;
	this.price=price;
	}	
	
	public void print() {
	System.out.println("Brand-"+brand);
	System.out.println("Price-"+price);
	}
}