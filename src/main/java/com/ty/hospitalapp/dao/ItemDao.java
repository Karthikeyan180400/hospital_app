package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Item;

public interface ItemDao {
	Item saveItem(Item item, int medOrder_id);

	Item getItemById(int id);

	List<Item> getItemsByMedOrderId(int medOrder_id);

	Item updateItem(Item item, int id);

	boolean deleteItem(int id);

}
