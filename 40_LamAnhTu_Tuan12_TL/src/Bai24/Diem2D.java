/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai24;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Diem2D {
    int x,y;
    public Diem2D(){}
    
    public Diem2D(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap X: ");
        int x = sc.nextInt();
        System.out.print("Nhap Y: ");
        int y = sc.nextInt();
    }
    
    public void hienThi(){
        System.out.println("("+x+","+y+")");
    }
    public void doiDiem(int dx,int dy){
        dx = x -1;
        dy = y -1;
        System.out.println("("+dx+","+dy+")");
    }
    public int giaTriX(){
        System.out.println("Gia tri Hoanh do: "+x);
        return x;
    }
    
    public int giaTriY(){
        System.out.println("Gia tri Tung do: "+y);
        return y;
    }
    
    public double khoangCach(){
        double kc = Math.sqrt(x*x +y*y);
        System.out.println("Khoang cach tu Diem ("+x+","+y+") den toa do goc la: "+kc );
        return kc;
    }
    
    public double khoangCach(int d){
        double kcd = Math.sqrt(Math.pow(d-x, 2)+Math.pow(d-y, 2));
        System.out.println("Khoang cach tu Diem ("+x+","+y+") den toa do d("+d+","+d+")  la: "+kcd);
        return kcd;
    }
}
