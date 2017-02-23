/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package corejavaexamples.oops;

/**
 *
 * @author iamsu
 */
public class EncapsulationExample {
    public static void main(String[] arg){
        Employee e=new Employee();
        e.setEmpId(101);
        e.setEmpName("Virat Kohli");
        System.out.println(e.getEmpId());
        System.out.println(e.getEmpName());
    }
}

class Employee{
    private int empId;
    private String empName;
    private String ssn;
    private float Salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
    
}
