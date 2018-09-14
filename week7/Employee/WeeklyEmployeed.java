/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.Employee;

/**
 *
 * @author RGUKT
 */
public class WeeklyEmployeed extends Employee{
	
		String fName;
		String lName;
		double numberOfWeeks;
		WeeklyEmployeed(String fName,String lName,double numberOfWeeks){
		this.fName=fName;
		this.lName=lName;
		this.numberOfWeeks=numberOfWeeks;
		

	}
	
	void display(){
		
		System.out.println("Name :"+fName +" " +lName);
		
	}
	
	double getAmount(){
		
		return (numberOfWeeks*1000);
		
	}

}
