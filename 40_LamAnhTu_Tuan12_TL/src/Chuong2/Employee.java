/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong2;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Employee implements Serializable {
    public String code;
    public String name;
    public Double salary;
    
    public Employee(){}
    public Employee(String code, String name, Double salary){
        this.code = code;
        this.name = name;
        this.salary = salary;
    }
}
