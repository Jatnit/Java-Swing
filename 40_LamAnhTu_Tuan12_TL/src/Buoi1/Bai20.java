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
public class Bai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều cao h: ");
        int h = sc.nextInt();

        // Vẽ tam giác cân
        for (int i = 1; i <= h; i++) {           
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
