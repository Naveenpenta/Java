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
public class ContractEmployee extends Employee{
    String department;
    String designation;
    String salary;
    
    ContractEmployee(String firstName,String lastName,String department,String designation,String salary){
    super(firstName,lastName);
    this.department=department;
    this.designation=designation;
    this.salary=salary;
    }
    ContractEmployee(String firstName,String lastName,String department,String designation){
    super(firstName,lastName);
    this.department=department;
    this.designation=designation;
    }
    

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }
    
    public String displayFullName(){
        return getFirstName()+" "+getLastName();
    }
    
    public String getSalary() {
        return salary;
    }
}

