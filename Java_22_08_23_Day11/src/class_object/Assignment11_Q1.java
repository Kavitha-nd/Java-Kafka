package class_object;


//Create a class “Book” with variables BookName, Author and Price and assign values using object and print the result.  

class Book{
	String bookName;
	String author;
	double price;
	
	void display() {
		System.out.println("Name: "+ bookName);
		System.out.println("Author: "+ author);
		System.out.println("Price: "+ price);
	}

}
public class Assignment11_Q1 {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.bookName = "Sherlock Holmes";
		b1.author = "Arthur";
		b1.price = 200;
		b1.display();
		
}

}
