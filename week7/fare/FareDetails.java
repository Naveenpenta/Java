/*
5. Create an Interface Fare with method getAmount() to get the amount paid for fare
 of travelling. Calculate the fare paid by bus and train implementing interface Fare. 
 */
package week7.fare;

/**
 *
 * @author RGUKT
 */
public class FareDetails {
	
	public static void main(String args[]){
		
		Bus B=new Bus(34);
		System.out.println("By Bus amount is : "+B.getAmount());
		
		Train T=new Train(56);
		System.out.println("By Train amount is : "+T.getAmount());
		
		
	}

}
