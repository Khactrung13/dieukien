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
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        double n = sc.nextDouble();
        if (n==0){
            System.out.println("Zero");
        }
        if (n>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
        if ( Math.abs(n)<1){
            System.out.println("small");
        }
        if (Math.abs(n)>1000000){
            System.out.println("large");
        }
}
}