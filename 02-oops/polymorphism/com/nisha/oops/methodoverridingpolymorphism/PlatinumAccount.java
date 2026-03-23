package com.nisha.oops.methodoverridingpolymorphism;

public class PlatinumAccount extends GoldAccount{
	
	public void rateOfInterest() {
		
		System.out.println("6% PA");
	}
	
	public static void main(String [] args) {
		
		PlatinumAccount obj = new PlatinumAccount();
		
		obj.onlineBanking();
		obj.rateOfInterest();
		
		GoldAccount G = new GoldAccount();
		
		G.onlineBanking();
		G.rateOfInterest();
	}

}
