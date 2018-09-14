/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

/**
 *
 * @author RGUKT
 */
public class Polymorphism {
        public static void main(String[] args){
            //With out polymorphism
            System.out.println("With out polymorphism");
            Rectangle r= new Rectangle(5,10);
            System.out.println(r.area());
            Triangle t= new Triangle(5,10);
            System.out.println(t.area());
            Circle c= new Circle(5);
            System.out.println(c.area());
            System.out.println("With polymorphism");
            //With polymorphism
            Shape s1= new Rectangle(5,10);
            System.out.println(s1.area());
            Shape s2= new Triangle(5,10);
            System.out.println(s2.area());
            Shape s3= new Circle(5);
            System.out.println(s3.area());
            
            
        }
}
