/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai27;

import java.util.Scanner;

/**
 *
 * @author Latu4
 */
public class Dinh {
    private double x;
    private double y;

    public Dinh() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Dinh(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Dinh(Dinh dinh) {
        this.x = dinh.x;
        this.y = dinh.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap toa do x: ");
        this.x = scanner.nextDouble();
        System.out.print("Nhap toa do y: ");
        this.y = scanner.nextDouble();
    }

    public void xuat() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}
