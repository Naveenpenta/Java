/*
3. Write an application to create a super class Employee with information first name
 & last name and methods getFirstName(), getLastName() derive the sub-classes
 ContractEmployee and RegularEmployee with the information about department,
 designation & method displayFullName() , getDepartment(), getDesig() to print the
 salary and to set department name & designation of the corresponding sub-class
 objects respectively.
4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee
 with information number of hours & wages per hour, number of weeks & wages per
 week respectively & method calculateWages() to calculate their monthly salary. Also
 override getDesig () method depending on the type of contract employee. 
 */
package week6.Employee;

/**
 *
 * @author RGUKT
 */
public class EmployeeTest {
    public static void main(String[] args){
    ContractEmployee ce= new ContractEmployee("laxmi","narayana","CSE","Asst Prof","33000");
    System.out.println(ce.displayFullName());
    System.out.println(ce.getDepartment());
    System.out.println(ce.getDesignation());
    System.out.println(ce.getSalary());
    
    RegularEmployee re= new RegularEmployee("sujoy","sarkar","CSE","Asst Prof","55000");
    System.out.println(re.displayFullName());
    System.out.println(re.getDepartment());
    System.out.println(re.getDesignation());
    System.out.println(re.getSalary());
    
    HourlyEmployee he= new HourlyEmployee("Raghu","K","CSE","Asst Prof",20,500.0);
    System.out.println(he.displayFullName());
    System.out.println(he.getDepartment());
    System.out.println(he.getDesignation());
    System.out.println(he.calculateWages()); 
    
    WeeklyEmployee we= new WeeklyEmployee("Harish","P","CSE","Asst Prof",4,5000.0);
    System.out.println(we.displayFullName());
    System.out.println(we.getDepartment());
    System.out.println(we.getDesignation());
    System.out.println(we.calculateWages());
}
}
