/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.shape;

/**
 *
 * @author RGUKT
 */
abstract class Shape2D{   
   abstract double getArea();  
}
class Square extends Shape2D{
   int s;
   Square(int s){
       this.s=s;
   }
   @Override
   double getArea(){
    return s*s;
   }
}
