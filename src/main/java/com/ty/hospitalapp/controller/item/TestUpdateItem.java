package com.ty.hospitalapp.controller.item;

import com.ty.hospitalapp.dto.Item;
import com.ty.hospitalapp.services.impl.ItemServicesImp;

public class TestUpdateItem {

	public static void main(String[] args) {
		ItemServicesImp itemServicesImp = new ItemServicesImp();
		Item item = new Item();
		item.setQuantity(4);
		Item item2 = itemServicesImp.updateItem(item, 1);
		if (item2 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}

}
