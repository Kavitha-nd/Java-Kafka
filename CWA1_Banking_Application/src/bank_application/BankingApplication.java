package bank_application;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
       
       	String[] names = new String[3];
        String[] mailIds = new String[3];
        String[] mobileNumbers = new String[3];
        String[] accountNumbers = new String[3];
        double[] currentBalances = new double[3];
        boolean[] isValid = new boolean[3];
        
        for (int i = 0; i < 1; i++) {
        	
        	Scanner scanner = new Scanner(System.in);
        	
            System.out.println("Enter details for Customer " + (i + 1));
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            
            System.out.print("Mail Id: ");
            mailIds[i] = scanner.nextLine();
            
            System.out.print("Mobile Number: ");
            mobileNumbers[i] = scanner.nextLine();
            
            System.out.print("Account Number: ");
            accountNumbers[i] = scanner.nextLine();
            
            System.out.print("Current Balance: ");
            currentBalances[i] = scanner.nextDouble();
            
            scanner.nextLine(); // newline 

            isValid[i] = validateDetails(names[i], mailIds[i], mobileNumbers[i], accountNumbers[i]); // here validate details are stored in array
            
           
        }
        // do display list of options using do-while and after selecting option go to particular action so using swtich inside do while
        int choice;
        do {
        	Scanner scanner = new Scanner(System.in);
       
            System.out.println("Options:");
            System.out.println("1. Validate Details");
            System.out.println("2. Display Details");
            System.out.println("3. Deposit");
            System.out.println("4. Withdrawal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
            case 1:
                validateDetails(names, mailIds, mobileNumbers, accountNumbers, isValid);
                break;
            case 2:
                displayDetails(names, mailIds, mobileNumbers, accountNumbers, currentBalances, isValid);
                break;
            case 3:
                deposit(currentBalances, accountNumbers, scanner);
                break;
            case 4:
                withdrawal(currentBalances, accountNumbers, scanner);
                break;
            case 5:
                System.out.println("Thank you for using the Banking Application.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
        	}while (choice != 5); 
        
    }
    
    
   // validation  
    static boolean validateDetails(String name, String mailId, String mobileNumber, String accountNumber) {
        boolean isValid = true; //  all details are initially valid
        
        if (!name.matches("[a-zA-Z ]+")) {
            isValid = false; // if doesn't matches RE , result will flse
        }
        if (!mailId.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}")) {
            isValid = false;
         }
        if (!mobileNumber.matches("\\d{10}")) {
            isValid = false;
        }
        if (accountNumber.length() != 11) {
            isValid = false;
          }
        return isValid;  // validate details are store in isvalid array
     }
    
    
    
    static void validateDetails(String[] names, String[] mailIds, String[] mobileNumbers, String[] accountNumbers, boolean[] isValid) {
        System.out.println("Validate result:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Mail Id: " + mailIds[i]);
            System.out.println("Mobile Number: " + mobileNumbers[i]);
           System.out.println("Account Number: " + accountNumbers[i]);
            System.out.println("Validation Status: " + (isValid[i] ? "Valid" : "Invalid")); // ternary opertor
            System.out.println();
        }
    }
    
    
    static void displayDetails(String[] names, String[] mailIds, String[] mobileNumbers, String[] accountNumbers, double[] currentBalances, boolean[] isValid) {
        System.out.println("Customer Details:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Mail Id: " + mailIds[i]);
            System.out.println("Mobile Number: " + mobileNumbers[i]);
            System.out.println("Account Number: " + accountNumbers[i]);
           System.out.println("Current Balance: " + currentBalances[i]);
            System.out.println("Validation Status: " + (isValid[i] ? "Valid" : "Invalid"));// ternary opearator
            System.out.println();
        }
    }
    
    
    //deposit method  takes 3 arguments e.g.. currentBalances is an array that holds the current balances of all customers
    static void deposit(double[] currentBalances, String[] accountNumbers, Scanner scanner) {
        System.out.print("Enter the account number for deposit: ");
        String accountNumber = scanner.next();
        
        System.out.print("Enter the amount to deposit: ");
        
        double amount = scanner.nextDouble();

        for (int i = 0; i < 3; i++) {
            if (accountNumbers[i].equals(accountNumber)) {
                currentBalances[i] += amount;
                
                System.out.println("Deposit successful. New balance: " + currentBalances[i]);
                return;
            }
        }
        System.out.println("Account number not found.");
       
    }
    
    static void withdrawal(double[] currentBalances, String[] accountNumbers, Scanner scanner) {
        System.out.print("Enter the account number for withdrawal: ");
        String accountNumber = scanner.next();
        System.out.print("Enter the amount to withdraw: ");
         double amount = scanner.nextDouble();

         for (int i = 0; i < 3; i++) {
            if (accountNumbers[i].equals(accountNumber)) {
                if (currentBalances[i] >= amount) {
                    currentBalances[i] -= amount;
                    
                    System.out.println("Withdrawal successful. New balance: " + currentBalances[i]);
                } else {
                    System.out.println("Insufficient balance.");
                }
                return;
            }
            System.out.println("Account number not found.");
          }
        scanner.close();
    }
}
