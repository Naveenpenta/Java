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
public class Employee {
    String firstName;
    String lastName;

    Employee(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
}
