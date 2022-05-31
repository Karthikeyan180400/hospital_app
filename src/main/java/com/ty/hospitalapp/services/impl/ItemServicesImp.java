package com.ty.hospitalapp.services.impl;

import java.util.List;

import com.ty.hospitalapp.dao.impl.ItemDaoImp;
import com.ty.hospitalapp.dto.Item;
import com.ty.hospitalapp.dto.MedOrder;
import com.ty.hospitalapp.services.ItemServices;

public class ItemServicesImp implements ItemServices {
	ItemDaoImp itemDaoImp = new ItemDaoImp();

	public Item saveItem(Item item, int medOrder_id) {
		MedOrder medOrder = updateMedOrderTotal(item, medOrder_id);
		item.setMedOrder(medOrder);
		return itemDaoImp.saveItem(item, medOrder_id);
	}

	public Item getItemById(int id) {
		return itemDaoImp.getItemById(id);
	}

	public List<Item> getItemsByMedOrderId(int medOrder_id) {
		return itemDaoImp.getItemsByMedOrderId(medOrder_id);
	}

	public Item updateItem(Item item, int id) {
		return itemDaoImp.updateItem(item, id);
	}

	public MedOrder updateMedOrderTotal(Item item, int medOrder_id) {
		MedOrderServicesImp medOrderServicesImp = new MedOrderServicesImp();
		MedOrder medOrder = medOrderServicesImp.getMedOrderById(medOrder_id);
		MedOrder medOrder1 = new MedOrder();
		medOrder1.setTotal(((item.getQuantity() * item.getCost()) + medOrder.getTotal()));
		MedOrder medOrder2 = medOrderServicesImp.updateMedOrder(medOrder1, medOrder_id);
		return medOrder2;

	}

	public boolean deleteItem(int id) {
		return itemDaoImp.deleteItem(id);
	}

}
