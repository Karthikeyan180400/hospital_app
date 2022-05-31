package com.ty.hospitalapp.controller.address;

import com.ty.hospitalapp.services.impl.AddressServicesImp;

public class TestDeleteAddress {

	public static void main(String[] args) {
		AddressServicesImp addressServicesImp = new AddressServicesImp();
		boolean res = addressServicesImp.deleteAddressById(3);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("No Address exists to delete for Given Id");
		}

	}

}
