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
class Sphere extends Shape3D{
   int r;
   Sphere(int r){
       this.r=r;
   }
   @Override
   double getVolume(){
    return (3/4)*Math.PI*r*r;
   }
}
