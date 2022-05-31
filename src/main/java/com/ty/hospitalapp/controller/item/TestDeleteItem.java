package com.ty.hospitalapp.controller.item;

import com.ty.hospitalapp.services.impl.ItemServicesImp;

public class TestDeleteItem {

	public static void main(String[] args) {
		ItemServicesImp itemServicesImp = new ItemServicesImp();
		boolean res = itemServicesImp.deleteItem(3);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Np Item exists to delete");
		}

	}

}
