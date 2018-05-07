package com.airline.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Flight
 *
 */

@NamedQuery(name="flight_findId", query="SELECT f FROM Flight f WHERE f.id=:id")
@Entity

public class Flight implements Serializable {

	private static final long serialVersionUID = 1L;

	public Flight() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@OneToMany(mappedBy="flightForPilot")
	private List<Pilot> pilots;
	
	
	@Enumerated(EnumType.STRING)
	private FlightDestinations flightOrigin;

	@Enumerated(EnumType.STRING)
	private FlightDestinations flightDestination;

	private Integer price;

	@Temporal(TemporalType.TIMESTAMP)
	private Date flightTime;

	@OneToOne
	@JoinColumn(name = "airplane_fk")
	private Airplane airplaneDetails;

	
	public List<Pilot> getPilots() {
		return pilots;
	}

	public void setPilots(List<Pilot> pilots) {
		this.pilots = pilots;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FlightDestinations getFlightOrigin() {
		return flightOrigin;
	}

	public void setFlightOrigin(FlightDestinations flightOrigin) {
		this.flightOrigin = flightOrigin;
	}

	public FlightDestinations getFlightDestination() {
		return flightDestination;
	}

	public void setFlightDestination(FlightDestinations flightDestination) {
		this.flightDestination = flightDestination;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}

	public Airplane getAirplaneDetails() {
		return airplaneDetails;
	}

	public void setAirplaneDetails(Airplane airplaneDetails) {
		this.airplaneDetails = airplaneDetails;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", pilots=" + pilots + ", flightOrigin=" + flightOrigin + ", flightDestination="
				+ flightDestination + ", price=" + price + ", flightTime=" + flightTime + ", airplaneDetails="
				+ airplaneDetails + "]";
	}

	

}
