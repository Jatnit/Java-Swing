/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong2;

/**
 *
 * @author latu2
 */
public class Department_Bai9 {
    String depCode,depName;

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Department_Bai9(String depCode, String depName) {
        this.depCode = depCode;
        this.depName = depName;
    }
    public String toString(){
        return depCode + "-" +depName;
    }
}
