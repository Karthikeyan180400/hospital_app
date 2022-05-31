package com.ty.hospitalapp.services;

import com.ty.hospitalapp.dto.Address;

public interface AddressServices {
	Address saveAddress(Address address, int branch_id);

	Address getAddressById(int id);

	Address getAddressByBranchId(int branch_id);

	Address updateAddress(Address address, int id);

	boolean deleteAddressById(int id);

}
