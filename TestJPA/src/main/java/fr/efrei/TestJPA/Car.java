package fr.efrei.TestJPA;
import javax.persistence.*;

@Entity
public class Car extends Vehicule {
	private int numberOfSeats;
	
	public Car() {
		super();
	}
	
	public Car (String plateNumber, int numberOfSeats) {
		
		super(plateNumber);
		this.numberOfSeats = numberOfSeats;
	}
	
	public Car (String plateNumber, Rent rent, int numberOfSeats) {
		
		super(plateNumber);
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getNumberOfSeats() {
		
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		
		this.numberOfSeats = numberOfSeats;
	}
}
