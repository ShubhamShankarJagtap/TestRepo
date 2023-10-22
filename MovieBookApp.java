package com.ticketBooking_Synchronization;

public class MovieBookApp extends Thread{
	
	static TicketBooking s;     // static variable of class TicketBooking for direct access in method main.
	
	int Seats;      // for storing the number of ticket's booked.
	
	public void run()   // non static method for booking the seat's.
	{
		System.out.println("TICKET BOOKING IS IN THE PROGRES PLEASE WAIT.........!");
		
		try {
			s.ticketBooking(Seats);
		} catch (Throwable e) {
			e.printStackTrace();
        }
		return;
    }

	public static void main(String[] args) {

		s = new TicketBooking();         // for instantiate the s.
		
		MovieBookApp shubham = new MovieBookApp();   // object = person
		
		shubham.Seats =7;   // instantiate seats.
		
		shubham.start();    // to start the thread execution.  
		
		MovieBookApp Amey = new MovieBookApp();    // new object
		
		Amey.Seats = 123;       // instantiate seats.
		
		Amey.start();        // to start the thread execution. 
		
		return;
     }
}
