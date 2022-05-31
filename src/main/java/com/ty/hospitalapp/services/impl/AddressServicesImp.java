package com.ty.hospitalapp.services.impl;

import com.ty.hospitalapp.dao.impl.AddressDaoImp;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.services.AddressServices;

public class AddressServicesImp implements AddressServices {
	AddressDaoImp addressDaoImp = new AddressDaoImp();

	public Address saveAddress(Address address, int branch_id) {
		return addressDaoImp.saveAddress(address, branch_id);
	}

	public Address getAddressById(int id) {
		return addressDaoImp.getAddressById(id);
	}

	public Address getAddressByBranchId(int branch_id) {
		return addressDaoImp.getAddressByBranchId(branch_id);
	}

	public Address updateAddress(Address address, int id) {
		return addressDaoImp.updateAddress(address, id);
	}

	public boolean deleteAddressById(int id) {
		return addressDaoImp.deleteAddressById(id);
	}

}
