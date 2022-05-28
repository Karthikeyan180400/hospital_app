package com.ty.hospitalapp.dao;

import com.ty.hospitalapp.dto.Address;

public interface AddressDao {
	Address saveAddress(Address address, int branch_id);

	Address getBranchAddressById(int id);

	Address updateAddress(Address address, int id);

	boolean deleteAddressById(int id);

}
