package org.booking.bus_ticket_booking.bus_entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="bus_db")
public class BusEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long busId;
	private String source;
	private String destination;
	private LocalDate date;
	private Double price;
}