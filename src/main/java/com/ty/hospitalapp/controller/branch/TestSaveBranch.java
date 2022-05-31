package com.ty.hospitalapp.controller.branch;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class TestSaveBranch {

	public static void main(String[] args) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		Branch branch = new Branch();
		branch.setName("Alvar Marathahalli");
		branch.setPhone(666666);
		branch.setEmail("ahm@mail.com");
		Branch branch2 = branchServicesImp.saveBranch(branch, 1);
		if (branch2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
