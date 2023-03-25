class SwipingMachine  {

	public static void main(String []args){


		CreditCard c= new CreditCard();
			
		swipe(c);
		DebitCard d = new DebitCard();

		swipe(d);

}

	public static void swipe(Card ob) {

	ob.payment();
}
}