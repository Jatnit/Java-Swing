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
public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        boolean nguyenTo = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                nguyenTo = false;
                break;
            }
        }

        if (nguyenTo) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }
}
