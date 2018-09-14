/*
2. Write an application that prompts the user for the radius of a circle and uses a
 method called circleArea to calculate the area of the circle and uses a method
 circlePerimeter to calculate the perimeter of the circle.
 */
package week5;

/**
 *
 * @author RGUKT
 */
import java.util.*;
class Circle{
	double radius;
	double CircleArea(){
		return (Math.PI*radius*radius);//pi*r^2		
	}
	double CirclePerimeter(){
		return(2*Math.PI*radius);//2*pi*r		
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Circle c1=new Circle();
		System.out.println("Enter Radius of the Circle to Calcaulate\n 1 Area of the circle\n 2 perimeter of the circle");
		c1.radius=in.nextDouble();
		System.out.println("Area of the Circle "+c1.CircleArea());
		System.out.println("Perimeter of the Circle "+c1.CirclePerimeter());
		
	}	
}