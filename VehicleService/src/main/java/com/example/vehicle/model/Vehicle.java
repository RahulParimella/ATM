package com.example.vehicle.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Vehicle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicleNo")
	private int id;
	@Column(name="vehicleName")
	private String vehicleName;
	@Column(name="seatingCapacity")
	private int seatingCapacity;
	@Column(name="driverId")
	private int driverId;
	@Column(name="vehicleType")
	private String vehicleType;
	@Column(name="farePerKm")
	private float farePerKm;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle( String vehicleName, int seatingCapacity, int driverId, String vehicleType, float farePerKm) {
		super();
		
		this.vehicleName = vehicleName;
		this.seatingCapacity = seatingCapacity;
		this.driverId = driverId;
		this.vehicleType = vehicleType;
		this.farePerKm = farePerKm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public float getFarePerKm() {
		return farePerKm;
	}
	public void setFarePerKm(float farePerKm) {
		this.farePerKm = farePerKm;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleName=" + vehicleName + ", seatingCapacity=" + seatingCapacity
				+ ", driverId=" + driverId + ", vehicleType=" + vehicleType + ", farePerKm=" + farePerKm + "]";
	}
	
	

}
