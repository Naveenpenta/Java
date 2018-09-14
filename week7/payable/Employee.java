/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.payable;

/**
 *
 * @author RGUKT
 */
public class Employee implements Payble {
		String fName;
		String lName;
		double salary;
		Employee(String fName,String lName,double salary){
			this.fName=fName;
			this.lName=lName;
			this.salary=salary;
			
		}
		void display(){
			
			System.out.println("Name : "+fName +" "+lName);
			
		}

		public double getAmount(){
			
			return salary;
			
		}
		
}