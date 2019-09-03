package com.bridgelabz.oops.jsonInventory.service;
import java.util.List;

import com.bridgelabz.oops.jsonInventory.model.Inventory;




public interface InventoryManagement 
{   public void addInventory(String list,String name, long weight, long price);
	public void removeInventory(String name);
	public void calculateInventory();
	public List<Inventory> fileRead();
	public void writeJson();

}
