package com.collabera.designpatterns.observer;

//Interface for Subject - Controls Which Stocks are watched and sends updates
public interface Subject {
	//Interface Methods
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
