package com.yash.collection.assignment.moviebooking;

import java.util.Objects;

public class Ticket {
	
	int ticket_id;
	int seat_no;
	String booking_time;
	@Override
	public String toString() {
		return "Ticket [ticket_id=" + ticket_id + ", seat_no=" + seat_no + ", booking_time=" + booking_time + "]";
	}
	public Ticket(int ticket_id, int seat_no, String booking_time) {
		super();
		this.ticket_id = ticket_id;
		this.seat_no = seat_no;
		this.booking_time = booking_time;
	}
	@Override
	public int hashCode() {
		return Objects.hash(booking_time, seat_no, ticket_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(booking_time, other.booking_time) && seat_no == other.seat_no
				&& ticket_id == other.ticket_id;
	}
	
}
