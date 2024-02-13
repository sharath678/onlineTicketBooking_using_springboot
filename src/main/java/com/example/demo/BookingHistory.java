package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BookingHistory {


	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int id;
	private String title;
	private String genre;
	private int tickets;
	private int totalPrice;
	public BookingHistory() {
		super();
	}
	public BookingHistory(int id, String title, String genre, int tickets, int totalPrice) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.tickets = tickets;
		this.totalPrice = totalPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "BookingHistory [id=" + id + ", title=" + title + ", genre=" + genre + ", tickets=" + tickets
				+ ", totalPrice=" + totalPrice + "]";
	}
	
	
}
