/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.Employee;

/**
 *
 * @author RGUKT
 */
public class WeeklyEmployee extends ContractEmployee{
    int weeks;
    double wages_per_week;
    
    WeeklyEmployee(String firstName,String lastName,String department,String designation,int weeks,double wages_per_week){
    super(firstName,lastName,department,designation);
    this.weeks=weeks;
    this.wages_per_week=wages_per_week;
    }
    
    double calculateWages(){
    return weeks*wages_per_week;
    }    
    
}
