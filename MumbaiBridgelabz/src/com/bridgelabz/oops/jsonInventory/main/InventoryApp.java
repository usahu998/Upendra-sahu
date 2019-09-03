package com.bridgelabz.oops.jsonInventory.main;

import com.bridgelabz.oops.jsonInventory.service.InventoryManagement;
import com.bridgelabz.oops.jsonInventory.service.InventoryManagementImp;
import com.bridgelabz.utility.ScanInput;

public class InventoryApp 
{
	public static void main(String[] args) {

		InventoryManagement inventaryImp = new InventoryManagementImp();
		
			String list="";
			System.out.println("Select your goods");
			System.out.println("Press 1-> Rice");
			System.out.println("Press 2-> Wheat");
			System.out.println("Press 3-> Pulses");
			int key=ScanInput.intInput();
			switch(key)
			{
			case 1: list="Rice";
			break;
			case 2: list="Wheat";
			break;
			case 3: list="Pulses";
			break;
			default: System.out.println("Invalid key ");
			break;
			}
			
			System.out.println("enter name ");
			String name = ScanInput.strInput();
			System.out.println("enter weight ");
			long weight =ScanInput.longInput();
			System.out.println("enter price ");
			long price = ScanInput.longInput();
			inventaryImp.addInventory(list,name, weight, price);

			inventaryImp.calculateInventory();
			System.out.println("enter the name to remove");
			String remove = ScanInput.wordInput();
			inventaryImp.removeInventory(remove);
			}
	}




