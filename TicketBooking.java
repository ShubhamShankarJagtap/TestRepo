package com.ticketBooking_Synchronization;

public class TicketBooking {
	
	int totalSeats = 125;
	
	  void ticketBooking(int seat) throws Throwable
	{
		if(totalSeats>=seat)
		{
			System.out.println("YOUR TICKET HAS BEEN BOOKED SUCCESFULLY. ");
			
			totalSeats =totalSeats-seat;
			
			System.out.println("SEAT'S AVAILABLE : " + totalSeats);
		}
		
		else
		{
			throw new Exception(" SEAT BOOKING FAILED SINCE ONLY " + totalSeats + " ARE AVAILABLE. ");
		}
	}
	 
}
