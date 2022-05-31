package com.ty.hospitalapp.controller.item;

import com.ty.hospitalapp.dto.Item;
import com.ty.hospitalapp.dto.MedOrder;
import com.ty.hospitalapp.services.impl.ItemServicesImp;

public class TestGetItem {

	public static void main(String[] args) {
		ItemServicesImp itemServicesImp = new ItemServicesImp();
		Item item = itemServicesImp.getItemById(2);
		if (item != null) {
			System.out.println("");
			MedOrder medOrder = item.getMedOrder();
			System.out.println("MedOrder Id: " + medOrder.getId());
			System.out.println("Item Name: " + item.getName());
			System.out.println("Item Type: " + item.getType());
			System.out.println("Item Quantity: " + item.getQuantity());
			System.out.println("Item cost: " + item.getCost());
		} else {
			System.out.println("No Item Exists");
		}

	}

}
