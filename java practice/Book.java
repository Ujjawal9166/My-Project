import java.util.Scanner;

class Book {

String bookName;
int bookId;
String author;


public Book()
{

Scanner ob = new Scanner(System.in);

System.out.println("Enter book name");

bookName = ob.next();
System.out.println("Enter Book ID");
bookId = ob.nextInt();
System.out.println("Enter Author name");
author = ob.next();

}

public static void main(String []args) {

Book b1= new Book();

b1.display();
Book b2= new Book();

b2.display();
Book b3= new Book();

b3.display();
 
public void display() {

System.out.println("Book Name "+bookName);
System.out.println("Book id "+bookId);
System.out.println("Author "+author);


}


}

}






