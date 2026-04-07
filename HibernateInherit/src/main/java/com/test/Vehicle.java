package com.test;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle")
@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)//it will create 3 
//@DiscriminatorColumn(tables
//		name="vehicle_type",
//		discriminatorType=DiscriminatorType.STRING
//		)

public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String v_name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getV_name() {
	return v_name;
}
public void setV_name(String v_name) {
	this.v_name = v_name;
}
public int getL_number() {
	return l_number;
}
public void setL_number(int l_number) {
	this.l_number = l_number;
}
private int l_number;

	
	
}
