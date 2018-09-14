/*
5. Implement the following case study using OOP concepts in Java.
 E-Book stall :
 Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
 Every Customer is having properties as : Customer_Id, Customer_Name,
 Customer_Address and he can buy Books from E-Book stall.
 Write a Program which will display the text book name and the remaining count of text
 books when a customer buys a text book
 */
package week3;
import java.util.Scanner;
/**
 *
 * @author RGUKT
 */
public class EBookStall {
    public static void main(String[] args){
    int amtSold[] = {0,0,0};
    Book b1 = new Book("java","Herbert Schild",10);
    Book b2 = new Book("DBMS","Navathe",20);
    Book b3 = new Book("MachineLearning","m bowles",10);
    Book[] books = new Book[3];
    books[0] =b1;
    books[1] =b2;
    books[2] =b3;
    while(true){
     
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter customer id");
    int c_id = sc.nextInt();
    System.out.println("Please enter customer name");
    String c_name = sc.next();
    System.out.println("Please enter customer address");
    String c_addr = sc.next();
    Customer c = new Customer(c_id,c_name,c_addr);
    System.out.println("Please enter book name");
    String bookname = sc.next();
    if(bookname.equals("java") || bookname.equals("DBMS") || bookname.equals("MachineLearning")){
        System.out.println("Please enter quantity");
        int quantity = sc.nextInt();
        switch(bookname){
            case "java":
                amtSold[0] = amtSold[1]+quantity;
                break;
            case "DBMS":
                amtSold[1] = amtSold[1]+quantity;
                break;
            case "MachineLearning":
                amtSold[2] = amtSold[2]+quantity;
                break;
            }
    
        }
        for(int i=0;i<3;i++){
        System.out.print(books[i].Book_Name+"\t");
        System.out.print(books[i].Book_Count - amtSold[i]);
        System.out.println();
        }
    }
    
    }
    
}


class Book{ 
        String Book_Name;
        String Book_Author;
	int Book_Count;
	Book(String Book_Name,String Book_Author, int Book_Count){
		this.Book_Name=Book_Name;
		this.Book_Author = Book_Author;
		this.Book_Count = Book_Count;
	}
}
class Customer{ 
        String Customer_Name;
        String Customer_Address;
	int Customer_Id;
        
	Customer(int Customer_Id, String Customer_Name,String Customer_Address){
		this.Customer_Id=Customer_Id;
		this.Customer_Name = Customer_Name;
		this.Customer_Address = Customer_Address;
	}
}
