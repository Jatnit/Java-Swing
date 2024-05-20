/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong2;

/**
 *
 * @author latu2
 */
public class Employee_Bai9 {
    String empCode,empName;
    int salary;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee_Bai9(String empCode, String empName, int salary) {
        this.empCode = empCode;
        this.empName = empName;
        this.salary = salary;
    }
    public String toString(){
        return empCode + "-" + empName;
    }
}
