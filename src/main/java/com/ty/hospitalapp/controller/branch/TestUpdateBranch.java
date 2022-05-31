package com.ty.hospitalapp.controller.branch;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class TestUpdateBranch {

	public static void main(String[] args) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		Branch branch = new Branch();
		branch.setEmail("ahan@mail.com");
		Branch branch1 = branchServicesImp.updateBranch(branch, 6);
		if (branch1 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}

}
