package com.ty.hospitalapp.controller.item;

import com.ty.hospitalapp.dto.Item;
import com.ty.hospitalapp.services.impl.ItemServicesImp;

public class TestSaveItem {

	public static void main(String[] args) {
		ItemServicesImp itemServicesImp = new ItemServicesImp();
		Item item = new Item();
		item.setName("Dollo");
		item.setType("tablet");
		item.setQuantity(3);
		item.setCost(5);

		Item item2 = itemServicesImp.saveItem(item, 1);
		if (item2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
