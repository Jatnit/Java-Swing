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
public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tong = 0;
        while (true) {
            System.out.print("Nhập số thực (Nhập 0 để kết thúc): ");
            double soThuc = sc.nextDouble();

            if (soThuc != 0) {
                tong += soThuc;
            } else {
                break;
            }
        }

        System.out.println("Tổng các số thực khác 0 đã nhập là: " + tong);
    }
}
