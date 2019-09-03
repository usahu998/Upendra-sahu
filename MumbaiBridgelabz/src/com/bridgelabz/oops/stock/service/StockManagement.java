package com.bridgelabz.oops.stock.service;

import java.util.List;

import com.bridgelabz.oops.stock.model.Stock;

public interface StockManagement 
{ 
	public void addStock(String stockName,long numberOfShare,long sharePrice);
	public void deleteStock(String stockName);
	public void calculateStock();
	public void writeJson();
	public List<Stock> fileRead();
	

}
