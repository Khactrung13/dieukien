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
public class Bai2 {
    public static void main(String[] args) {
    int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        num1 = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        num2 = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        num3 = scanner.nextInt();
        if( num1 > num2 && num1 > num3){
            System.out.println(num1+" là số lớn nhất");
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println( num2+" là số lớn nhất");
        }else{
            System.out.println( num3+" là số lớn nhất");
        }    
}
}