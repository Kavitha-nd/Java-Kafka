package interface_inheritance;

import java.util.Scanner;

//Use Interface to implement Single inheritance to get and display the book details such as book id, book name, author and price.  


//Define the interface for Book
interface BookDetails {
	void getInput();
	void displayDetails();
}

//Implement the interface in a class
class Book implements BookDetails {
	String bookId, bookName, author;
	double price;
	
 
	@Override
 	public void getInput() {
     	Scanner sc = new Scanner(System.in);
     
     	System.out.print("Enter Book ID: ");
     	bookId = sc.nextLine();
     
     	System.out.print("Enter Book Name: ");
     	bookName = sc.nextLine();
     
     	System.out.print("Enter Author: ");
     	author = sc.nextLine();
     
     	System.out.print("Enter Price: ");
     	price = sc.nextDouble();
 }
 
 	@Override
 	public void displayDetails() {
 		System.out.println("Book Details:");
 		System.out.println("Book ID: " + bookId);
 		System.out.println("Book Name: " + bookName);
 		System.out.println("Author: " + author);
 		System.out.println("Price: " + price);
 }
}

public class Assignment17_Q1 {

	public static void main(String[] args) {
		Book book = new Book();
	    book.getInput();
	    book.displayDetails();

	}

}
