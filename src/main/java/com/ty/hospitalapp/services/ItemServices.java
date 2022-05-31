package com.ty.hospitalapp.services;

import java.util.List;

import com.ty.hospitalapp.dto.Item;
import com.ty.hospitalapp.dto.MedOrder;

public interface ItemServices {
	Item saveItem(Item item, int medOrder_id);

	Item getItemById(int id);

	List<Item> getItemsByMedOrderId(int medOrder_id);

	Item updateItem(Item item, int id);
	
	public MedOrder updateMedOrderTotal(Item item, int medOrder_id);

	boolean deleteItem(int id);

}
