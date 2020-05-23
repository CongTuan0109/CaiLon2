/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucThi;

import ConNguoi.connguoi;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class thucthi {
    public static void main(String[] args) {
        ArrayList<connguoi> cn=new ArrayList<>();
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap so nguoi");
        a=sc.nextInt();
        sc.nextLine();
        connguoi person;
        for(int i=0;i<a;i++)
        {
            person=new connguoi();
            person.nhap();
            cn.add(person);
        }
        for(int i=0;i<cn.size();i++)
        {
            cn.get(i).xuat();
        }
    }
    
}
