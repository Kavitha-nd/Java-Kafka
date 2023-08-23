package class_object;
//
//import java.util.Scanner;
//
////Create a class “Loginn” with variables Username and Password. 
////Use methods for input, validation and output the values respectively.  
////Call those methods using 2 different objects.
//

import java.util.Scanner;

class Loginn {
	String username;
	String password;
	
	// inputs method give input in runtime
	void inputs() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the username: ");
		username = sc.nextLine();
		
		System.out.print("Enter the password: ");
		password = sc.nextLine();
	
}
	// validation method for user_name & password
	boolean validation() {
		 return username.equals("Kavi") && password.equals("1234");
	}
	
	//display method for Loginn status
	void display(boolean isLogged) {
		if (isLogged) {
			System.out.println("Logged in successfelly");
		}else {
			System.out.println("Incorrect username/password");
		}
	}
	
	
}
public class Assignment11_Q4 {

	public static void main(String[] args) {
		
		Loginn user1 = new Loginn();
		user1.inputs();
	
		
		boolean v1 = user1.validation();
		user1.display(v1);
		
		
		Loginn user2 = new Loginn();
		user2.inputs();
	
		
		boolean v2 = user2.validation();
		user2.display(v2);
		
	}

}