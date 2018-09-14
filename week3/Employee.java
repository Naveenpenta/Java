
/*1. Write a program to display details of the required employee based on his Id.
 The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation,
 Emp_salary, Emp_Address etc.,*/
package week3;
import java.util.*;
/**
 *
 * @author RGUKT
 */
public class Employee {
    
        int Emp_id;
	String Emp_name;
	int Emp_age;
	char Emp_gender;
	String Emp_designation;
	float Emp_salary;
        String Emp_Address;
        
        Employee(int Emp_id, String Emp_name, int Emp_age, char Emp_gender, String Emp_designation, float Emp_salary, String Emp_Address){
        this.Emp_name = Emp_name;
        this.Emp_id = Emp_id;
        this.Emp_age = Emp_age;
        this.Emp_gender = Emp_gender;
        this.Emp_designation = Emp_designation;
        this.Emp_salary = Emp_salary;
        this.Emp_Address = Emp_Address;
        }
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Narender",26,'M',"Asst.Prof",36000,"Rgukt Basar");
        Employee e2 = new Employee(2,"Srikanth",26,'M',"Asst.Prof",36000,"Rgukt Basar");
        Employee e3 = new Employee(3,"Laxmi",26,'M',"Asst.Prof",36000,"Rgukt Basar");
        Employee e4 = new Employee(4,"Charan",26,'M',"Asst.Prof",36000,"Rgukt Basar");
        
        Employee[] arrEmp = new Employee[4];
        arrEmp[0] = e1;
        arrEmp[1] = e2;
        arrEmp[2] = e3;
        arrEmp[3] = e4;
        
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter Id");
	int id=sc.nextInt();
        for(Employee e:arrEmp){
            if(id == e.Emp_id){
            System.out.println(e.Emp_name);
            System.out.println(e.Emp_age);
            System.out.println(e.Emp_gender);
            System.out.println(e.Emp_designation);
            System.out.println(e.Emp_salary);
            System.out.println(e.Emp_Address);
            }
        }
        
    }
       
    
    
}
