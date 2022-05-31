package com.ty.hospitalapp.controller.branch;

import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class TestGetBranchAddress {

	public static void main(String[] args) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		Address address = branchServicesImp.getBranchAddressById(1);
		if(address != null) {
			Branch branch = address.getBranch();
			System.out.println("Branch Name: "+branch.getName());
			System.out.println("Street: " + address.getStreet());
			System.out.println("City: " + address.getCity());
			System.out.println("Satate: " + address.getState());
			System.out.println("Country: " + address.getCountry());
			System.out.println("Pincode: " + address.getPincode());
		} else {
			System.out.println("No Address exists for given Branch");
		}

	}

}
