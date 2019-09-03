package com.bridgelabz.oops.stock.main;


import com.bridgelabz.oops.stock.service.StockManagement;
import com.bridgelabz.oops.stock.service.StockPortfolio;
import com.bridgelabz.utility.ScanInput;

public class StockApp {

	public static void main(String[] args) {
		StockManagement stkImp=new StockPortfolio();
		
		System.out.println("Enter number of stocks");
		int numberOfStocks=ScanInput.intInput();
		for (int i = 1; i <= numberOfStocks; i++) 
		{
			System.out.println("Enter "+i+" stock name");
			String stockName=ScanInput.strInput();               //input string stock name
			System.out.println("Enter "+i+" number of share");
			long numberOfShare=ScanInput.longInput();            // input long number of share
			System.out.println("Enter "+i+" share price");
			long sharePrice=ScanInput.longInput();               // input long share Price
	
			stkImp.addStock(stockName, numberOfShare, sharePrice);
			
			stkImp.calculateStock(); 
			
			System.out.println("Enter the name to remove");
		String removeStock=ScanInput.strInput();
			stkImp.deleteStock(removeStock);
		}
	}

}
