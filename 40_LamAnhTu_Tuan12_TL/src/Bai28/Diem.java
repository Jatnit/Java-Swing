/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai28;

import java.util.Scanner;

/**
 *
 * @author Latu4
 */
public class Diem {
    protected int x;
    protected int y;

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap toa do x: ");
        this.x = scanner.nextInt();
        System.out.print("Nhap toa do y: ");
        this.y = scanner.nextInt();
    }

    public void hienThi() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
