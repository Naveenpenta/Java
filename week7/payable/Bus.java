/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.fare;

/**
 *
 * @author RGUKT
 */
public class Bus implements Fare {
	long busNumber;
	int distance;
	Bus(int distance){
		this.distance=distance;		
	}
	
	
	
	public double getAmount(){
		
		return (distance*55);
		
		
	}
	
	

}
