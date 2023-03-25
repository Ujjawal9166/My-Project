class Pen {

String brand;
String color;
int price;

public static void main(String []argd) {

Pen p1 = new Pen("RAYNOLDS", "Blue", 5);

Pen p2 = new Pen("WRITO METER","BLACK",20);

Pen p3 = new Pen("CELLO","GREEN",10);

p1.details();
p2.details();
p3.details();
}

public void details() {

System.out.println("brands "+ brand);
System.out.println("color "+ color);
System.out.println("price "+ price);
}

public Pen(String b, String c, int p) {

brand = b;
color = c;
price = p;
}
}





