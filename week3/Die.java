/*
4. Write a java program : rolling a pair of dices 10 times [ each attempt should be delayed
 by 10000 ms ] and count number Successful attempts.
 successful attempt : If the pair of Dice results in same values.
 */
package week3;

/**
 *
 * @author RGUKT
 */
import java.util.Random;

class Die{ 
    int roll(){
        Random r=new Random();
        return (int)(6*r.nextDouble());
    }
}
public class DieRoll {
    public static void main(String[] args) throws InterruptedException{
    int count=0;   
    Die d1=new Die();
    Die d2=new Die();
    for(int i=0;i<10;i++){
        Thread.sleep(1000);
        if(d1.roll() == d2.roll())
        count++;
        System.out.println("two Die rolled"+(i+1));
    }
    System.out.println("Successful attempts are "+count);
    // out.println("");
  }     
}


/*
import java.util.*;
/*class dice{
	public static void main(String[] args){
		int count=0;
		int[] dice1={1,2,3,4,5,6};
		int[] dice2={1,2,3,4,5,6};
		int d1=dice1.length;
		int d2=dice2.length;
		for(int i=1;i<=10;i++){
			int k=(int)(Math.random()*d1);
			int j=(int)(Math.random()*d2);
			System.out.println(dice1[k]+ " "+dice2[j]);
			if(dice1[k]==dice2[j]) count=count+1;
		
		}System.out.println("Successful attems are::  "+count);
			
	}	
}*/

class Die{
	
		int roll(){
		Random r=new Random();
		int value=r.nextInt(6);
		return value;
	}
	public static void main(String[] args){
		int count=0;
		Die d1=new Die();
		Die d2=new Die();
		for(int i=0;i<10;i++){
		int v1=d1.roll();
		int v2=d2.roll();
		//System.out.println(v1 + " "+ v2);
		
		//System.out.println(v1);
		//System.out.println(v2);
		if(v1==v2){
			count=count+1;
		}
		}
		System.out.println("Successful attems are::  "+count);
		
	}
}*/
