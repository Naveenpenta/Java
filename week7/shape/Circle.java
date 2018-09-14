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
class Circle extends Shape2D{
   int r;
   Circle(int r){
       this.r=r;
   }
   @Override
   double getArea(){
    return Math.PI*r*r;
   }
}
