/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConNguoi;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class connguoi {
     public String ten;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        String n;
        System.out.println("Nhap ten may di");
        n=sc.nextLine();
        setTen(n);
    }
    public void xuat()
    {
        System.out.println("ten may la"+getTen());
    }
}
