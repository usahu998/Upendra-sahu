package com.bridgelabz.oops.stock.service;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oops.stock.model.Stock;
import com.google.gson.Gson;

public class StockPortfolio implements StockManagement 
{
	List<Stock> stocks = new ArrayList<>();
	JSONParser parser=new JSONParser();
	JSONObject object=new JSONObject();

	@Override
	public void addStock(String stockName, long numberOfShare, long sharePrice) {
		try {
			fileRead();    //read json file
		
		Stock stk=new Stock();
		stk.setStockName(stockName);
		stk.setNumberOfShare(numberOfShare);
		stk.setSharePrice(sharePrice);
		
		stocks.add(stk);
		//stocks.forEach(stocks1 -> System.out.println(stocks1.toString()));

		writeJson();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
// deleting the single stock name wise
	@Override
	public void deleteStock(String stackName) {
		stocks.removeIf(stocks1 -> stocks1.getStockName().equals(stackName));
		writeJson();
		
	}
// calculating each share price
	@Override
	public void calculateStock() {
		// using for each loop with lambda expression
		stocks.forEach(stock -> {
			System.out.println(
					"Total price of " + stock.getStockName()+ " is " + (stock.getNumberOfShare() * stock.getShareprice()));
		});
		
	}

	// reading the stock object
	@Override
	public List<Stock> fileRead() {
		
		JSONArray jsonArray;
		{
			try {
				jsonArray = (JSONArray) parser.parse(new FileReader("/home/mobicomp/eclipse-workspace/Bridgelabz/src/com/bridgelabz/oops/stock/json/JsonStock.json"));
				for (Object obj : jsonArray) 
				{
					Stock stk=new Stock();                                   
					JSONObject jobject=(JSONObject) obj;
					String stockName=(String) jobject.get("stockName");
					stk.setStockName(stockName);
					long numberOfShare=(long) jobject.get("numberOfShare");
					stk.setNumberOfShare(numberOfShare);
					long sharePrice=(long) jobject.get("sharePrice");
					stk.setSharePrice(sharePrice);
					
					stocks.add(stk);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return stocks;
	}
	
	@Override
	public void writeJson() {
		Gson gson = new Gson();     //Gson object is to convert gson to json.
		String json = gson.toJson(stocks);

		try (FileWriter file = new FileWriter(
				"/home/mobicomp/eclipse-workspace/Bridgelabz/src/com/bridgelabz/oops/stock/json/JsonStock.json")) {
			file.write(json);
			System.out.println("written to json");
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Stocks :" + json);  //printing the list of stock
	}

}
