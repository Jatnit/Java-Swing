/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnTap;

/**
 *
 * @author Administrator
 */
public class SV_Bai1 {
    public String name;
    public Double marks;
    public String major;
    
    public String getGrade(){
        if (this.marks <3) {
            return "Kem";
        }
        if (this.marks <5) {
            return "Yeu";
        }
        if (this.marks <6.5) {
            return "Trung Binh";
        }
        if (this.marks <7.5) {
            return "Kha";
        }
        if (this.marks <9) {
            return "Gioi";
        }
        return "Xuat sac";
    }
    public boolean isBonus(){
        return this.marks >= 7.5;
    }
}
