/*
6. Create an Interface StudentFee with method getAmount(),getFirstName(),getLastName(),
 getAddress(), getContact(). Calculate the amount paid by the Hostler and NonHostler
 student by implementing interface Student Fee 
 */
package week7.student;

/**
 *
 * @author RGUKT
 */
public class StudentFeeDetails {
	
	public static void main(String[] args){
		
		Hostler H=new Hostler("Penta","Naveen","NZB",954299976,200);
		System.out.println("Name: "+H.getFirstName()+" "+H.getLastName());
		System.out.println("Address: "+H.getAddress());
		System.out.println("Contact number : "+H.getContact());
		System.out.println("Student Fee : "+H.getAmount());
		
		
		NonHostler NH=new NonHostler("Amgoth","Babulal","Nalgonda",964024871,199);
		System.out.println("Name: "+NH.getFirstName()+" "+NH.getLastName());
		System.out.println("Address: "+NH.getAddress());
		System.out.println("Contact number : "+NH.getContact());
		System.out.println("Student Fee : "+NH.getAmount());
		
		
		
		
		
		
	}

}
