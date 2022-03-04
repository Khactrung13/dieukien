/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println(" nhap so thu nhat:");
        double a = sc.nextDouble();
        System.out.println(" nhap so thu hai:");
        double b = sc.nextDouble();
        
        a= Math.round(a*1000);
        a=a/1000;
        
        b = Math.round( b*1000);
        b= b/1000;
        if(a==b){
            System.out.println("Chung khac nhau");
        }
        else {
            System.out.println("giong nhau 3 so thap phan");
        }
    }
    
}
