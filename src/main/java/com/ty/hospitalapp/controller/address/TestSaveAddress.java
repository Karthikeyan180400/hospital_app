package com.ty.hospitalapp.controller.address;

import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.services.impl.AddressServicesImp;

public class TestSaveAddress {

	public static void main(String[] args) {
		AddressServicesImp addressServicesImp = new AddressServicesImp();
		Address address = new Address();
		address.setStreet("4th cross,Marathahalli");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode("560068");
		Address address2 = addressServicesImp.saveAddress(address, 1);
		if (address2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
