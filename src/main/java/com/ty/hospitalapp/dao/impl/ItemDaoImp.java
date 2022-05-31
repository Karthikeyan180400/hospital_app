package com.ty.hospitalapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.ItemDao;
import com.ty.hospitalapp.dto.Item;
import com.ty.hospitalapp.dto.MedOrder;
import com.ty.hospitalapp.services.impl.ItemServicesImp;
import com.ty.hospitalapp.services.impl.MedOrderServicesImp;

public class ItemDaoImp implements ItemDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Item saveItem(Item item, int medOrder_id) {
		entityTransaction.begin();
		entityManager.persist(item);
		entityTransaction.commit();
		return item;
	}

	public Item getItemById(int id) {
		Item item = entityManager.find(Item.class, id);
		return item;
	}

	public List<Item> getItemsByMedOrderId(int medOrder_id) {
		MedOrderServicesImp medOrderServicesImp = new MedOrderServicesImp();
		MedOrder medOrder = medOrderServicesImp.getMedOrderById(medOrder_id);
		return medOrder.getItems();
	}

	public Item updateItem(Item item, int id) {
		Item item2 = entityManager.find(Item.class, id);
		int quantity = item2.getQuantity();
		item2.setQuantity(item.getQuantity());
		entityTransaction.begin();
		entityManager.merge(item2);
		entityTransaction.commit();
		item2.setQuantity(Math.abs(item.getQuantity() - quantity));
		ItemServicesImp itemServicesImp = new ItemServicesImp();
		MedOrder medOrder = item2.getMedOrder();
		itemServicesImp.updateMedOrderTotal(item2, medOrder.getId());
		return item2;
	}

	public boolean deleteItem(int id) {
		Item item = entityManager.find(Item.class, id);
		if (item != null) {
			MedOrder medOrder = item.getMedOrder();
			int medOrder_id = medOrder.getId();
			double total = Math.abs(medOrder.getTotal() - (item.getQuantity() * item.getCost()));
			medOrder.setTotal(total);
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			MedOrderServicesImp medOrderServicesImp = new MedOrderServicesImp();
			medOrderServicesImp.updateMedOrder(medOrder, medOrder_id);

			return true;
		}
		return false;
	}

}
