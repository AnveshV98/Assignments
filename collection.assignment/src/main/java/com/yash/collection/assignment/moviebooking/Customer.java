package com.yash.collection.assignment.moviebooking;

import java.util.Objects;

public class Customer {
	String customer_name;
	String movie_name;
	@Override
	public String toString() {
		return "Customer [customer_name=" + customer_name + ", movie_name=" + movie_name + "]";
	}
	public Customer(String customer_name, String movie_name) {
		super();
		this.customer_name = customer_name;
		this.movie_name = movie_name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customer_name, movie_name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customer_name, other.customer_name) && Objects.equals(movie_name, other.movie_name);
	}
	

}
