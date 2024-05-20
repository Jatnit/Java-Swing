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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, max, min;
        System.out.println("Nhập số nguyên a:");
        a = sc.nextInt();
        System.out.println("Nhập số nguyên b:");
        b = sc.nextInt();
        System.out.println("Nhập số nguyên c:");
        c = sc.nextInt();
        max = a;
        min = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Số lớn nhất là:" + max);
        System.out.println("Số nhỏ nhất là:" + min);
    }
}
