package com.ty.hospitalapp.controller.address;

import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.services.impl.AddressServicesImp;

public class TestGetAddressById {
	public static void main(String[] args) {
		AddressServicesImp addressServicesImp = new AddressServicesImp();
		Address address = addressServicesImp.getAddressById(1);
		if (address != null) {
			System.out.println("Street: " + address.getStreet());
			System.out.println("City: " + address.getCity());
			System.out.println("Satate: " + address.getState());
			System.out.println("Country: " + address.getCountry());
			System.out.println("Pincode: " + address.getPincode());
			Branch branch = address.getBranch();
			System.out.println("Branch Id: " + branch.getId());
		} else {
			System.out.println("No Address exists");
		}

	}

}
