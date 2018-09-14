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
public class HourlyEmployee extends ContractEmployee{
    int hours;
    double wages_per_hour;
    
    HourlyEmployee(String firstName,String lastName,String department,String designation,int hours,double wages_per_hour){
    super(firstName,lastName,department,designation);
    this.hours=hours;
    this.wages_per_hour=wages_per_hour;
    }
    
    double calculateWages(){
    return hours*wages_per_hour;
    }  
    
    @Override
    public String getDesignation() {
        return "Ad HOC "+designation;
    }
    
}
