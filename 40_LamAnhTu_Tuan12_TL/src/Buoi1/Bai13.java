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
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        System.out.print("Các ước số lẻ của n là: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
