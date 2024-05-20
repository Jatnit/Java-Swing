/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm: ");
        double diem = sc.nextDouble();

        String ketQua = "";
        if (diem >= 8.5 && diem <= 10) {
            ketQua = "A";
        } else if (diem >= 7.0 && diem <= 8.4) {
            ketQua = "B";
        } else if (diem >= 5.5 && diem <= 6.9) {
            ketQua = "C";
        } else if (diem >= 4.0 && diem <= 5.4) {
            ketQua = "D";
        } else {
            ketQua = "F";
        }

        System.out.println("Kết quả: " + ketQua);
    }
}
