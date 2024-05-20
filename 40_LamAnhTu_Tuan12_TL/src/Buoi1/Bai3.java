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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhập số nguyên a:");
        a = sc.nextInt();
        System.out.println("Nhập số nguyên b:");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("Số lớn hơn là:" + a);
            System.out.println("Số nhỏ hơn là:" + b);
        } else{
            System.out.println("Số lớn hơn là:" + b);
            System.out.println("Số nhỏ hơn là:" + a);
        }
        
    }
}
