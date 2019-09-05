package com.bridgelabz.oops.Commercialdataprocessing;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import practice.setter;

public class StockAccount implements StockInterface {
	Stack stack = new Stack(100);
	LinkedList ls = new LinkedList();
	StackList ls1 = new StackList();
	Queue queue = new Queue(100);
	QueueList ls2 = new QueueList();

	private Customer customer;
	private CompanyShares companyShares;

	public static ObjectMapper objM = new ObjectMapper();
	File customerFile = new File("/home/admin1/eclipse-workspace/jsonfiles/Customer.json");
	File compSharesFile = new File("/home/admin1/eclipse-workspace/jsonfiles/CompanyShares.json");

	public StockAccount() {

	}

	// constructor having argument
	public StockAccount(String fileName) {
		StockUtility.addAccount(fileName);
	}

	@Override
	
	public double valueOf() {
		Scanner sc = new Scanner(System.in);
		try {
			List<Customer> customerList = objM.readValue(customerFile, new TypeReference<List<Customer>>() {
			});
			List<CompanyShares> companySharesList = objM.readValue(compSharesFile,
					new TypeReference<List<CompanyShares>>() {
					});

			System.out.println("Enter the person name");
			String searchName = sc.next().toUpperCase();
			int index = StockUtility.searchCustomerIndex(searchName, customerList);
			if (index != -1) {
				Customer customer = new Customer();
				customer = customerList.get(index);

				int relianceShares = companySharesList.get(0).getPrice() * customer.getRelianceShares();
				int hdfcShares = companySharesList.get(1).getPrice() * customer.getHdfcShares();
				int iciciShares = companySharesList.get(2).getPrice() * customer.getIciciShares();

				int totalValue = relianceShares + hdfcShares + iciciShares;

				System.out.print("\nTotal Value of Stock: ");

				return (double) totalValue;
			} else {
				return -1;
			}

		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public void list()
	{
		
			try {
				List<CompanyShares> companySharesList = objM.readValue(compSharesFile,
						new TypeReference<List<CompanyShares>>() {
						});
				List<Customer> customerList = objM.readValue(customerFile, new TypeReference<List<Customer>>() {
				});
				
				String str="";
				//List<>abcd=objM.readValue(new File(path),new TypeReference<List<setter>>() {});
				for(int i=0;i<companySharesList.size();i++)
				{
					str=companySharesList.get(i).toString();
					//System.out.println(""+set);
					ls.add(str);
					
				}
				
				
			
			} catch (IOException e) {
				System.out.println(""+e.getMessage());
				e.printStackTrace();
			}
			
			
	}
	@Override
	
	public void buy(int amount, String symbol) {
		Scanner sc = new Scanner(System.in);
		try {
			List<CompanyShares> companySharesList = objM.readValue(compSharesFile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objM.readValue(customerFile, new TypeReference<List<Customer>>() {
			});
			System.out.println("Enter the person name");

			String searchName = sc.next().toUpperCase();
			int custIndex = StockUtility.searchCustomerIndex(searchName, customerList);
			int stockIndex = StockUtility.searchSharesBySymbol(symbol, companySharesList);
			String stackSymbol = null;
			CompanyShares companyShares = null;
			if (custIndex != -1) {
				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares - amount);
				stackSymbol = companyShares.getStockSymbol();
				// ls.add(companyShares);

				// System.out.println(stockIndex);
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) {
					int value = customer.getRelianceShares();
					customer.setRelianceShares(value + amount);
				}
				if (stockIndex == 1) {
					int value = customer.getHdfcShares();
					customer.setHdfcShares(value + amount);
				}
				if (stockIndex == 2) {
					int value = customer.getIciciShares();
					customer.setIciciShares(value + amount);
				}
			} else {
				System.out.println("stock not found!");
			}

			objM.writerWithDefaultPrettyPrinter().writeValue(compSharesFile, companySharesList);
			objM.writerWithDefaultPrettyPrinter().writeValue(customerFile, customerList);

			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
			System.out.println("------------------------------------------------------------------");
			System.out.println(companySharesList.get(stockIndex).toString());

			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "Reliance(Shares)", "HDFC(Shares)",
					"ICICI(Shares)");
			System.out.println("-------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("==================In LIST==================");
			//ls.add(companyShares);
			System.out.println("Company Shares in LIST:");
			list();
			ls.print();
		
			System.out.println("---------------------------------------------");
			stack.push(stackSymbol);
			System.out.println("Company Symbol in STACK LIST:");
			ls1.print();
			System.out.println("-------------------------------------------");

			String str = "";
			Date currentDate = new Date();
			str = currentDate.toString();
			queue.enqueue(str);
			// System.out.println("Date in QueueList:");

			queue.push(str);
			ls2.print();
			System.out.println("");

			// System.out.println("Queue LIST");
			// ls2.print();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void sell(int amount, String symbol) {
		Scanner sc = new Scanner(System.in);
		try {

			List<CompanyShares> companySharesList = objM.readValue(compSharesFile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objM.readValue(customerFile, new TypeReference<List<Customer>>() {
			});

			int stockIndex = StockUtility.searchSharesBySymbol(symbol, companySharesList);
			System.out.println("Enter the person name");
			String searchName = sc.next().toUpperCase();
			int custIndex = StockUtility.searchCustomerIndex(searchName, customerList);
			String stackSymbol = "";
			CompanyShares companyShares = null;
			if (custIndex != -1) {
				companyShares = companySharesList.get(stockIndex);
				int noOfShares = companyShares.getNoOfShares();
				companyShares.setNoOfShares(noOfShares + amount);

				System.out.println("");
				stackSymbol = companyShares.getStockSymbol();
				// ls.add(companyShares);

				// System.out.println(stockIndex);
				Customer customer = customerList.get(custIndex);
				if (stockIndex == 0) {
					int value = customer.getRelianceShares();
					customer.setRelianceShares(value - amount);
				}
				if (stockIndex == 1) {
					int value = customer.getHdfcShares();
					customer.setHdfcShares(value - amount);
				}
				if (stockIndex == 2) {
					int value = customer.getIciciShares();
					customer.setIciciShares(value - amount);
				}
			} else {
				System.out.println("stock not found!");
			}

			objM.writerWithDefaultPrettyPrinter().writeValue(compSharesFile, companySharesList);
			objM.writerWithDefaultPrettyPrinter().writeValue(customerFile, customerList);

			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
			System.out.println("---------------------------------------------------------------------");
			System.out.println(companySharesList.get(stockIndex).toString());

			System.out.println("\n----------Customer Details----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "Reliance(Shares)", "HDFC(Shares)",
					"ICICI(Shares)");
			System.out.println("----------------------------------------------------------------------");
			System.out.println(customerList.get(custIndex).toString());
			System.out.println("==================In LIST==================");
			
			System.out.println("Company Shares in LIST:");
			list();
			ls.print();
			
			System.out.println("---------------------------------------------");
			stack.push(stackSymbol);
			System.out.println("Company Symbol in STACK LIST:");
			ls1.print();
			System.out.println("-------------------------------------------");

			String str = "";
			Date currentDate = new Date();
			str = currentDate.toString();
			queue.enqueue(str);
			// System.out.println("Date in QueueList:");

			queue.push(str);
			
			ls2.print();
			System.out.println("");

			// System.out.println(""+str);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void save(String fileName, List<Customer> customerList) {
		try {
			objM.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), customerList);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void printReport() {
		try {
			List<CompanyShares> companySharesList = objM.readValue(compSharesFile,
					new TypeReference<List<CompanyShares>>() {
					});
			List<Customer> customerList = objM.readValue(customerFile, new TypeReference<List<Customer>>() {
			});

			System.out.println("\n----------Stock Details----------");
			System.out.printf("%-15s %-20s %-20s\n", "Company Name", "NO. of Stocks", "Price");
			System.out.println("-----------------------------------------------------------------");
			for (int i = 0; i < companySharesList.size(); i++) {

				System.out.println(companySharesList.get(i).toString());
			}

			System.out.println("\n----------Customer Details----------");
			System.out.printf("\n%-15s %-20s %-20s %-20s\n", "Cust. Name", "Reliance(Shares)", "HDFC(Shares)",
					"ICICI(Shares)");
			System.out.println("----------------------------------------------------------------------");
			for (int i = 0; i < customerList.size(); i++) {
				System.out.println(customerList.get(i).toString());
			}
			
		} catch (IOException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();
		}

	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CompanyShares getCompanyShares() {
		return companyShares;
	}

	public void setCompanyShares(CompanyShares companyShares) {
		this.companyShares = companyShares;
	}

}
