package com.campusfp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@RestResource(rel="customers", path="customer")
public class CustomerEntity {	
	@Id
	long id;
	
	@Column
	String nombre;
	
	@Column
	String ciudad;
	
	@Column
	String email;
}
