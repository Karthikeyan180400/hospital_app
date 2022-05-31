package com.ty.hospitalapp.controller.branch;

import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class TestDeleteBranch {

	public static void main(String[] args) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		boolean res = branchServicesImp.deleteBranchById(7);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}

	}

}
