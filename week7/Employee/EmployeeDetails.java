/*
 2. Create an abstract class Employee with methods getAmount() which displays the
 amount paid to employee. Reuse this class to calculate the amount to be paid to
 WeeklyEmployeed and HourlyEmployee according to no. of hours and total hours
 for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee. 
 */
package week7.Employee;

/**
 *
 * @author RGUKT
 */
public class EmployeeDetails {
	
	public static void main(String[] args){
		
		
		Employee HE=new HourlyEmployee("Penta","Naveen",9);
		HE.display();
		System.out.println("Salary: "+HE.getAmount());
		
		
		Employee WE=new WeeklyEmployeed("Afreed","Salman",5);
		WE.display();
		System.out.println("Salary: "+WE.getAmount());
	}

}
