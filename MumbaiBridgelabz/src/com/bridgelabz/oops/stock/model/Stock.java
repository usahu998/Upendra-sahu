package com.bridgelabz.oops.stock.model;

public class Stock 
{
	private String stockName;
	private long numberOfShare;
	private long sharePrice;
	//Getter Setter method
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public long getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(long numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public long getShareprice() {
		return sharePrice;
	}
	public void setSharePrice(long sharePrice) {
		this.sharePrice = sharePrice;
	}

}
