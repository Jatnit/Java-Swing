/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai25;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PhanSo {

    int tuso, mauso;

    public PhanSo() {
    }

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void nhapGiaTri() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        int tuso = sc.nextInt();
        do {
            System.out.print("Nhap mau so: ");
            int mauso = sc.nextInt();
        } while (mauso == 0);
    }

    public void HienThi() {
        if (tuso == 0) {
            System.out.println("Ta co Phan so = 0");
        }
        if (mauso == 1) {
            System.out.println("Ta co Phan so = " + tuso);
        } else {
            System.out.println("Ta co Phan so = " + tuso + "/" + mauso);
        }
    }

    public void nghichDao() {
        tuso = -1 * tuso;
        mauso = -1 * mauso;
        System.out.println("Ta co Phan so = " + tuso + "/" + mauso);
    }

    public void giaTriNghichDao() {
        int gtmTuSo = -1 * tuso;
        int gtmMauSo = -1 * mauso;
        System.out.println("Ta co Phan so = " + tuso + "/" + mauso);
        System.out.println("Ta co Phan so da nghich dao = " + gtmTuSo + "/" + gtmMauSo);
    }
    
    public void giaTriThuc(){
        float gtt = (float)tuso/(float)mauso;
        System.out.println("Gia tri thuc cua phan so la: "+ gtt);
    }
    
  
}
