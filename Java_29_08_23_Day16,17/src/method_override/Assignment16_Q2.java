package method_override;

import java.util.Scanner;

//Use Hierarchical inheritance to achieve method overriding.
//Class Stock: Get input for Stock Id, Stock Name, Quantity, Price. In method “put”, display all the details.
//Class Purchase: Stock Name, Quantity. Add the quantity of the stock and calculate the amount for the purchased quantity.  In method “put”, display the stock name, stock available and purchased amount.  
//Class Sales: Input same as class purchase.  Reduce the quantity in stock and calculate the amount for the sold stock.  In method “put”, display the result like purchase.


class Stock{
	int stockId;
	String stockName;
	int quantity;
	double price;
	
	public void getInputs() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Stock Id: ");
        stockId = sc.nextInt();
        
        System.out.print("Enter Stock Name: ");
        stockName = sc.next();
        
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
        
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
	}
	 public void put() {
		 System.out.println("-------------------------");
	        System.out.println("Stock Details:");
	        System.out.println("Stock Id: " + stockId);
	        System.out.println("Stock Name: " + stockName);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Price: " + price);
	    }
}

class Purchase extends Stock{
	int purchasedQuantity;
	
	public void getInputs() {
		super.getInputs();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Purchased Quantity: ");
		purchasedQuantity = sc.nextInt();	
	}
	
	public void put() {
		super.put();
        double purchasedAmount = purchasedQuantity * price;
        
        System.out.println("Purchased Quantity: " + purchasedQuantity);
        System.out.println("Purchased Amount: " + purchasedAmount);
	}
}

class Sales extends Stock{
	int soldQuantity;
	
	public void getInputs() {
		super.getInputs();
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Sold Quantity: ");
        soldQuantity = sc.nextInt();
	}
	public void put() {
		super.put();
		if(soldQuantity > quantity) {
			System.out.println("No stock avaliable: ");
		}else {
			double soldAmount = soldQuantity * price;
			
            System.out.println("Sold Quantity: " + soldQuantity);
            System.out.println("Sold Amount: " + soldAmount);
		}
	}
}
public class Assignment16_Q2 {

	public static void main(String[] args) {
		
		Purchase p = new Purchase();
		p.getInputs();
		p.put();
		
		Sales s = new Sales();
		s.getInputs();
		s.put();
	
	}

}
