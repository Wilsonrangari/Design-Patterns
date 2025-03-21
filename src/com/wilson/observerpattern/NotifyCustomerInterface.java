package com.wilson.observerpattern;

import java.util.ArrayList;
import java.util.List;


 interface NotifyCustomerInterface {
	 
	void notification(String tweet);
}

class Customer implements NotifyCustomerInterface {
	
	String name;
	Customer(String name){
		this.name = name;
	}

	@Override
	public void notification(String tweet) {
		System.out.println(name+" has received notification "+tweet);		
	}
	
}

interface ManageSubscribersAndNotify{
	public void addSubscriber(NotifyCustomerInterface r);
	public void removeSubscriber(NotifyCustomerInterface r);
	public void notifyAllSubscriber(String tweet);
	
}

class InsuranceCompany implements ManageSubscribersAndNotify{
	
	String name;
	InsuranceCompany(String name){
		this.name = name;
	}
	
	List<NotifyCustomerInterface> subscriberList = new ArrayList<>();

	@Override
	public void addSubscriber(NotifyCustomerInterface r) {
		subscriberList.add(r);	
	}

	@Override
	public void removeSubscriber(NotifyCustomerInterface r) {
		subscriberList.remove(r);	
	}

	@Override
	public void notifyAllSubscriber(String tweet) {
		subscriberList.forEach(f->f.notification(tweet));	
	}
	
	public void broadcastMessage(String message) {
		notifyAllSubscriber(message);	
	}
}
