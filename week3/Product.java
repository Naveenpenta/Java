/*2. A mail-order house sells five products whose retail prices are as follows : Product
 1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50
 and Product 5 : Rs. 40.49 . Each product has Prdouct_Id, Product_Name,
 Product_Quantity, Product_Price. Write an application that reads a series of pairs of
 numbers as follows :
 a) product Id
 b) quantity sold
 your program use a switch statement to determine the retail price for each product.
 it should calculate and display the total retail value of all products sold.*/
package week3;

/**
 *
 * @author RGUKT
 */
import java.util.Scanner;

class Product{ 
        String Product_Name;
        int Prdouct_Id;
	double Product_Price,Product_Quantity;
	Product(int Prdouct_Id,String Product_Name,double Product_Price, double Product_Quantity){
		this.Prdouct_Id=Prdouct_Id;
		this.Product_Name = Product_Name;
		this.Product_Price = Product_Price;
		this.Product_Quantity= Product_Quantity;
	}
//}

//public class ProductSales{
    public static void main(String[] args){
    double productAmt[] = {0,0,0,0,0};
    Product p1 = new Product(1,"Product1",99.90,20);
    Product p2 = new Product(2,"Product2",20.20,30);
    Product p3 = new Product(3,"Product3",6.87, 50);
    Product p4 = new Product(4,"Product4",45.50,20);
    Product p5 = new Product(5,"Product5",40.49,100);
    while(true){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter product number(1-5)");
    int productId = sc.nextInt();
    if(productId >=1 && productId <=5){
        System.out.println("Please enter quantity");
        double quantity = sc.nextDouble();
        switch(productId){
            case 1:
                productAmt[1] = productAmt[1]+quantity * p1.Product_Price;
                break;
            case 2:
                productAmt[2] = productAmt[2]+quantity * p2.Product_Price;
                break;
            case 3:
                productAmt[3] = productAmt[3]+quantity * p3.Product_Price;
                break;
            case 4:
                productAmt[4] = productAmt[4]+quantity * p4.Product_Price;
                break;
            case 5:
                productAmt[5] = productAmt[5]+quantity * p5.Product_Price;
                break;
            }
    
        }
        for(int i=1;i<=5;i++){
        System.out.print("Product"+i);
        System.out.print("\t"+productAmt[i-1]);
        System.out.println();
        }
    }
    
    }
}
