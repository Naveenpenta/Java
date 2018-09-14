/*
1. Write a Java program to find Area and Circle of different shapes using polymorphism
 concept

 */
package week6;

/**
 *
 * @author RGUKT
 */
abstract class Shape {
   abstract double area();
    
}

class Rectangle extends Shape{
    double h,w;
    
    Rectangle(double h,double w){
    this.h=h;
    this.w=w;
    }
    @Override
    double area() {
        return h*w;
    }

}
class Circle extends Shape{
    double r;
    
    Circle(double r){
    this.r=r;
    }
    @Override
    double area() {
        return Math.PI*Math.sqrt(r);
    }

}

class Triangle extends Shape{
    double b,h;
    
    Triangle(double b,double h){
    this.b=b;
    this.h=h;
    }
    @Override
    double area() {
        return (b*h)/2;
    }

}
