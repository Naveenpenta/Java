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
public class EmployeeDetails {

	public static void main(String args[]){
		
		
		Employee E=new Employee("Penta","Naveen",20000);
		E.display();
		System.out.println("Salary : "+E.getAmount());
		
		
		
	}
	
}
