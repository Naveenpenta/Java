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
abstract class Shape3D{
   abstract double getVolume();    
}
class Cube extends Shape3D{
    int s;
   Cube(int s){
       this.s=s;
   }
   @Override
   double getVolume(){
    return s*s*s;
   }
}
