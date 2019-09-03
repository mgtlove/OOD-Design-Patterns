package com.collabera.designpatterns.observer;

//Driver class for Observer Patterns Package
public class GrabStocks {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.60);
		stockGrabber.setAAPLPrice(667.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.unregister(observer1);
		
		stockGrabber.setIBMPrice(197.60);
		stockGrabber.setAAPLPrice(667.60);
		stockGrabber.setGOOGPrice(676.40);
		
		//Start Thread Simulator
		//Construct the Runnable Classes with Parameters
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 667.600);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);
		//Start the Threads
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
		
		

	}

}
