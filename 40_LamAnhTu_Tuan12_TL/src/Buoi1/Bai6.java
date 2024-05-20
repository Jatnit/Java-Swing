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
public class Bai6 {
    public static void main(String[] args) {
        int year;

        // Nhập giá trị của year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm: ");
        year = scanner.nextInt();

        // Kiểm tra năm nhuận
        if (year % 400 == 0) {
            System.out.println(year + " là năm nhuận");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " là năm nhuận");
        } else {
            System.out.println(year + " không phải là năm nhuận");
        }
    }
}
