/*3. Write java program that inputs 5 numbers, each between 10 and 100 inclusive. As
 each number is read display it only if it’s not a duplicate of any number already read
 display the complete set of unique values input after the user enters each new value*/
package week3;

/**
 *
 * @author RGUKT
 */
import java.util.*;
class Duplicate{
	Scanner iin=new Scanner(System.in);
	void insert(int i){
		System.out.println("enter number to insert");
			int number1=iin.nextInt();
			arr[i]=number1;
	
		
	}
public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter how many numbers you want to insert");
		int number=in.nextInt();
		int arr[]=new int[number];
		for(int i=0;i<number;i++)
		{
			
			insert(i);
			
		}
	
}	
	
	
}
