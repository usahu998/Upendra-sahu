package com.bridgelabz.jsoninventory.main;


import com.bridgelabz.jsoninventory.service.InventoryManagement;
import com.bridgelabz.jsoninventory.service.InventoryManagementImp;
import com.bridgelabz.utility.ScannerInput;

public class InventoryApp 
{
	public static void main(String[] args) {

		InventoryManagement inventaryImp = new InventoryManagementImp();
		
			String list="";
			System.out.println("Select your goods");
			System.out.println("Press 1-> Rice");
			System.out.println("Press 2-> Wheat");
			System.out.println("Press 3-> Pulses");
			int key=ScannerInput.intInput();
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
			String name = ScannerInput.strInput();
			System.out.println("enter weight ");
			long weight =ScannerInput.longInput();
			System.out.println("enter price ");
			long price = ScannerInput.longInput();
			inventaryImp.addInventory(list,name, weight, price);

			inventaryImp.calculateInventory();
			System.out.println("enter the name to remove");
			String remove = ScannerInput.wordInput();
			inventaryImp.removeInventory(remove);
			}
	}




