/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.student;

/**
 *
 * @author RGUKT
 */

public class Hostler {
    String fname;
    String lname;
    String address;
    long contactnumber;
    double days;
    
    Hostler( String fname,String lname,String address,long contactnumber,double days){
    	this.fname=fname;
    	this.lname=lname;
    	this.address=address;
    	this.contactnumber=contactnumber;
    	this.days=days;
    	
    }
    
    public String getFirstName(){
    	
    	System.out.println("Hostlar");
    	return fname;
    }
    
    public String getLastName(){
    	
    	return lname;
    	
    }
    
    public String getAddress(){
    	
    	return address;
    	  	
    }
    
    public long getContact(){
    	
    	return contactnumber;
    }

    public double getAmount(){
    	
    	return(days*150);
    	
    }
	
}

