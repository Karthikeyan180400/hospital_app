package com.ty.hospitalapp.controller.address;

import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.services.impl.AddressServicesImp;

public class TestUpdateAddress {

	public static void main(String[] args) {
		AddressServicesImp addressServicesImp = new AddressServicesImp();
		Address address = new Address();
		address.setStreet("23rd");
		Address address1 = addressServicesImp.updateAddress(address, 3);
		if (address1 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}

}
