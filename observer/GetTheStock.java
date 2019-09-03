package com.collabera.designpatterns.observer;

import java.text.DecimalFormat;

//Class Implements Runnable For Multi-Threading Stocks
public class GetTheStock implements Runnable {

	//Class Attributes
	private int startTime;
	private String stock;
	private double price;
	
	private Subject stockGrabber;
	
	//Class Methods
	public GetTheStock(Subject stockGrabber, int newStartTime, String newStock,
			double newPrice) {
		
		this.stockGrabber = stockGrabber;
		
		startTime = newStartTime;
		stock = newStock;
		price = newPrice;
	}
	
	@Override
	public void run() {
		//Set duration period for thread - each i sleeps(2000 milSec)
		for (int i = 1; i < 20; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//RandNum is random number to simulate price flux in data while threading
			double randNum = (Math.random() * (.06)) - .03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format((price + randNum)));
			//Conditionals for setting price to each stock
			if(stock == "IBM") {((StockGrabber)stockGrabber).setIBMPrice(price);}
			if(stock == "AAPL") {((StockGrabber)stockGrabber).setAAPLPrice(price);}
			if(stock == "GOOG") {((StockGrabber)stockGrabber).setGOOGPrice(price);}
			//Output of the thread in each iteration
			System.out.println(stock + ": " + df.format((price + randNum)) + 
					" " + df.format(randNum));
			System.out.println();
		}
		
	}

}
