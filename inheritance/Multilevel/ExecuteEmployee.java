class ExecuteEmployee {

public static void main(String []args) {

		System.out.println("BIODATA");
	
		System.out.println("--------------");



	QspTrainer ob = new QspTrainer("Renuka",30,101,65000d,"BTM","API");
	
		ob.print();

 		System.out.println("--------------");

	QspTrainer ob1 = new QspTrainer("Vivek",35,102,60000d,"BTM","MANUAL T");
			
		ob1.print();
	
		System.out.println("--------------");

 	 
	QspTrainer ob2 = new QspTrainer("Shruti",34,103,80000d,"BTM","Core java");
			
		ob2.print();

}

}
