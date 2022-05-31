package com.ty.hospitalapp.controller.medorder;

import java.util.List;

import com.ty.hospitalapp.dto.Item;
import com.ty.hospitalapp.dto.MedOrder;
import com.ty.hospitalapp.services.impl.MedOrderServicesImp;

public class TestGetMedOrder {

	public static void main(String[] args) {
		MedOrderServicesImp medOrderServicesImp = new MedOrderServicesImp();
		MedOrder medOrder = medOrderServicesImp.getMedOrderById(1);
		if (medOrder != null) {
			System.out.println("MedOrder_Id: " + medOrder.getId());
			List<Item> items = medOrder.getItems();
			for (Item item : items) {
				System.out.println("");
				System.out.println("Item Name: " + item.getName());
				System.out.println("Item Type: " + item.getType());
				System.out.println("Item Quantity: " + item.getQuantity());
				System.out.println("Item cost: " + item.getCost());
				System.out.println("__________________________________________________");
			}
			System.out.println("Total: Rs." + medOrder.getTotal());

		} else {
			System.out.println("No MedOrder Exists");
		}

	}

}
