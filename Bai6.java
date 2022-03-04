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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        int month = sc.nextInt();
        System.out.println("NHap nam: ");
        int year = sc.nextInt();
        switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:  
            System.out.println("Thang" + month + " Nam " + year +" co 31 ngay ");
            
            break;
        case 2:
            if(year %400==0 || (year%4==0 && year%100!=0)){
                System.out.println(" Thang " + month + " Nam " + year + "co 29 ngay");
           
                }
                else{
                System.out.println(" Thang " + month + " Nam " + year + "co 28 ngay");
          
                }
                break;
       
        case 4: case 6 : case 9: case 11: 
            System.out.println(" Thang" + month + " Nam " + year + "co 30 ngay");
       
            break;
       
        default:
            System.out.println(" Nhap sai thang!!");
        }
    }
    
}
