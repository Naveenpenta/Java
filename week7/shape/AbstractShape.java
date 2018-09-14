/*
1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
 shapes with methods getArea() and getVolume(). Reuse this class to calculate the area
 and volume of square ,circle ,cube and sphere. 
 */
package week7.shape;

/**
 *
 * @author RGUKT
 */
public class AbstractShape {
public static void main(String args[]){
Square s= new Square(3);
System.out.println(s.getArea());
Circle c= new Circle(3);
System.out.println(c.getArea());

Cube cb= new Cube(3);
System.out.println(cb.getVolume());
Sphere sp= new Sphere(3);
System.out.println(sp.getVolume());
}
}
