/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai24;

/**
 *
 * @author Administrator
 */
public class SDDiem {
    public static void main(String[] args) {
        Diem2D toadoa = new Diem2D(3,4);
        toadoa.hienThi();
        Diem2D toadob = new Diem2D();
        toadob.nhapDiem();
        toadob.hienThi();
        Diem2D toadoc = new Diem2D();
        toadoc.hienThi();
        toadob.khoangCach();
        toadoa.khoangCach(3);
    }
}
