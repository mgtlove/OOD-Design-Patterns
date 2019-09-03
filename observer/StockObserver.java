package com.collabera.designpatterns.observer;

public class StockObserver implements Observer {
	//Class Attributes
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
		//Static Class Counter
	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockGrabber;
	
	//Class Methods
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		
		System.out.println("New Observer " + this.observerID);
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}
	
	public void printThePrices() {
		System.out.println(observerID + "\nIBM: " + ibmPrice +
				"\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
	}
	
}
