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
public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        int dem = 0;
        int temp = n;
        while (temp > 0) {
            int chuSo = temp % 10;
            if (chuSo % 2 != 0) {
                dem++;
            }
            temp /= 10;
        }

        System.out.println("Số lượng chữ số lẻ của n là: " + dem);
    }
}
