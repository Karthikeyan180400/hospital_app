package com.ty.hospitalapp.controller;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class TestSaveBranch {

	public static void main(String[] args) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		Branch branch = new Branch();
		branch.setName("Appollo Banasankari");
		branch.setPhone(444444);
		branch.setEmail("apb@mail.com");
		Branch branch2 = branchServicesImp.saveBranch(branch, 2);
		if (branch2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
