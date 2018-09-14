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
public class HourlyEmployee extends Employee{
	
		String fName;
		String lName;
		double numberOfHours;
	HourlyEmployee(String fName,String lName,double numberOfHours){
		this.fName=fName;
		this.lName=lName;
		this.numberOfHours=numberOfHours;
		

	}
	
	void display(){
		
		System.out.println("Name :"+fName +" " +lName);
		
	}
	
	double getAmount(){
		
		return (numberOfHours*100);
		
	}

}	
