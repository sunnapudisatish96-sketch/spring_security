package com.example.Customer;
import java.util.ArrayList;
import java.util.List;

import com.example.Address.Address;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private List<Address> addresses=new ArrayList<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return email;
	}
	public void SetEmail(String email) {
		this.email=email;
	}
	public List<Address>getAddress(){
		return addresses;
	}
	public void setAddresses(List<Address>addresses) {
		this.addresses=addresses;
	}
	

}
