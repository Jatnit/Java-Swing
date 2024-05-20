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
public class Bai5 {
    public static void main(String[] args) {
        int a, b, c;
        // Nhập giá trị của a, b, c
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        a = sc.nextInt();
        System.out.print("Nhập hệ số b: ");
        b = sc.nextInt();
        System.out.print("Nhập hệ số c: ");
        c = sc.nextInt();

        // Tính delta
        int delta = b * b - 4 * a * c;

        // Kiểm tra delta
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x = " + (-b / 2 * a));
        } else {
            System.out.println("Phương trình có hai nghiệm x1 = " + (-b + Math.sqrt(delta)) / 2 * a + ", x2 = " + (-b - Math.sqrt(delta)) / 2 * a);
        }
    }
}
