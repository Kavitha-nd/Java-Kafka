package bus_ticket;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Bus{
	String busNo;
	String source;
	String destination;
	String time;
	int totalSeats;
	int seatsRemaining;
	double busFare;
	
	public Bus(String busNo, String source, String destination, String time, int totalSeats, double busFare) {
        this.busNo = busNo;
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.totalSeats = totalSeats;
        this.seatsRemaining = totalSeats;
        this.busFare = busFare;
    }
}

class Booking{
	 int bookingId;
	 String passengerName;
	 String source;
	 String destination;
	 String dateOfJourney;
	 int numPassengers;
	 String busNo;
	 int passengersCount;
	 double busFare;
	 
	 
	public Booking(int bookingId, String passengerName, String source, String destination, String dateOfJourney, int numOfPassengers, String busNo, double busFare) {
	   this.bookingId = bookingId;
	   this.passengerName = passengerName;
	   this.source = source;
	   this.destination = destination;
	   this.dateOfJourney = dateOfJourney;
	   this.numPassengers = numOfPassengers;
	   this.busNo = busNo;
	   this.busFare = busFare;
	}	
}
public class BusReservationSystem {
	static ArrayList<Bus> buses = new ArrayList<>(); 
	static ArrayList<Booking> bookings = new ArrayList<>();
	
	static AtomicInteger bookingIdGenerator = new AtomicInteger(1);
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Welcome to Bus Reservation and Ticketing System!");
		System.out.println("------------------------------------------------------");
		while (true) {
            System.out.println("Select Role:\n 1.Admin \n 2.User\n 3.Exit");
            int roleChoice = sc.nextInt();

            switch (roleChoice) {
                case 1:
                    adminPanel();
                    break;
                case 2:
                    userPanel();
                    break;
                case 3:
                	System.out.println("Existing");
                	return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
	public static void adminPanel() {
		System.out.println("------------------------------------------------------");
		while(true) {
			System.out.println("Admin Panel:\n 1.Add Bus details\n 2.View Bus Details\n 3.View Bookings\n 4.Exit ");
			int adminChoice = sc.nextInt();
			
			switch (adminChoice) {
				case 1:
					addBusDetails();
				case 2:
					viewBusDetails();
				case 3:
					ViewBookings();
				case 4:
					return;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
		
	}
	public static void addBusDetails() {
		System.out.println("------------------------------------------------------");
		System.out.print("Enter Bus No: ");
        String busNo = sc.next();
        
        System.out.print("Enter Source: ");
        String source = sc.next();
        
        System.out.print("Enter Destination: ");
        String destination = sc.next();
        
        System.out.print("Enter Time: ");
        String time = sc.next();
        
        System.out.print("Enter Total Seats: ");
        int totalSeats = sc.nextInt();
        
        System.out.print("Enter Bus Fare: ");
        double busFare = sc.nextDouble();
        
        Bus bus = new Bus(busNo, source, destination, time, totalSeats, busFare);
        buses.add(bus);
	}
	public static void viewBusDetails() {
		System.out.println("------------------------------------------------------");
		System.out.println("\nBus Details:");
		for (int i = 0; i < buses.size(); i++) {
		    Bus bus = buses.get(i);
		    
            System.out.println("Bus No: " + bus.busNo);
            System.out.println("Source: " + bus.source);
            System.out.println("Destination: " + bus.destination);
            System.out.println("Time: " + bus.time);
            System.out.println("Total Seats: " + bus.totalSeats);
            System.out.println("Seats Remaining: " + bus.seatsRemaining);
            System.out.println("Bus Fare: " + bus.busFare);
            System.out.println();
        }
		
	}
	public static void ViewBookings() {
		System.out.println("------------------------------------------------------");
		System.out.println("\nBooking Details:");
		for (int i = 0; i < bookings.size(); i++) {
		    Booking booking = bookings.get(i);
            System.out.println("Booking ID: " + booking.bookingId);
            System.out.println("Passenger Name: " + booking.passengerName);
            System.out.println("Source: " + booking.source);
            System.out.println("Destination: " + booking.destination);
            System.out.println("Date of Journey: " + booking.dateOfJourney);
            System.out.println("Number of Passengers: " + booking.numPassengers);
            System.out.println();
		
		}
	}	
	public static void userPanel() {
		while(true) {
			System.out.println("------------------------------------------------------");
			System.out.println("User Panel:\n 1.Book Ticket\n 2.Cancel Ticket\n 3.Exit");
			int userChoice = sc.nextInt();
			
			switch(userChoice) {
				case 1:
					bookTicket();
					break;
				case 2:
					cancelTicket();
					break;
				case 3:
					return;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
		
	}
	public static void bookTicket() {
		 if (buses.isEmpty()) {
	            System.out.println("No buses available for booking.");
	            return;
	        }
			System.out.println("------------------------------------------------------");
			System.out.print("Enter Passenger Name: ");
	        String passengerName = sc.next();
	        
	        System.out.print("Enter Source: ");
	        String source = sc.next();
	        
	        System.out.print("Enter Destination: ");
	        String destination = sc.next();
	        
	        System.out.print("Enter Date of Journey: ");
	        String dateOfJourney = sc.next();
	        
	        System.out.print("Enter Number of Passengers: ");
	        int numPassengers = sc.nextInt();
	        
	        // Find available buses
	        System.out.println("----------\nAvailable Buses:");
	        int index = 1;
	        for (int i = 0; i < buses.size(); i++) {
	        	 Bus bus = buses.get(i);
	            if (bus.seatsRemaining >= numPassengers) {
	                System.out.println(index + ". Bus No: " + bus.busNo);
	                System.out.println(" Source: " + bus.source);
	                System.out.println(" Destination: " + bus.destination);
	                System.out.println(" Bus Fare: " + bus.busFare);
	                index++;
	            }
	        }

	        if (index == 1) {
	            System.out.println("No buses available with the required number of seats.");
	            return;
	        }

	        System.out.print("Select a Bus (Enter the Index number): ");
	        int selectedBusIndex = sc.nextInt();
	    
	        if (selectedBusIndex < 1 || selectedBusIndex >= index) {
	            System.out.println("Invalid bus selection.");
	            return;
	        }

	        Bus selectedBus = null;
	        int selectedBusCount = 0;

	        for (Bus bus : buses) {
	            if (bus.seatsRemaining >= numPassengers) {
	                selectedBusCount++;
	                if (selectedBusCount == selectedBusIndex) {
	                    selectedBus = bus;
	                    break;
	                }
	            }
	        }

	        double totalFare = selectedBus.busFare * numPassengers;
	        selectedBus.seatsRemaining -= numPassengers;
	        
			int bookingId = bookingIdGenerator.getAndIncrement();
			
	        Booking booking = new Booking(bookingId, passengerName, source, destination, dateOfJourney, numPassengers, selectedBus.busNo, totalFare);
	        bookings.add(booking);

	        System.out.println("\nBooking Successful!");
	        System.out.println("Booking ID: " + bookingId);
	        System.out.println("Bus No: " + selectedBus.busNo);
	        System.out.println("Total Fare: " + totalFare);
	       
    }
	public static void cancelTicket() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available to cancel.");
            return;
        }

        System.out.print("Enter Booking ID to Cancel: ");
        int bookingId = sc.nextInt();

        boolean found = false;
        for (Booking booking : bookings) {
            if (booking.bookingId == bookingId) {
                for (Bus bus : buses) {
                    if (bus.busNo.equals(booking.busNo)) {
                        bus.seatsRemaining += booking.numPassengers;
                        break;
                    }
                }
                bookings.remove(booking);
                found = true;
                System.out.println("Booking ID " + bookingId + " has been cancelled.");
                break;
            }
        }

        if (!found) {
            System.out.println("Booking not found with ID: " + bookingId);
        }
    }
}	

