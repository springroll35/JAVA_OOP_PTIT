/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coban;

import java.util.Scanner;

/**
 *
 *
 * @author Admin
 */

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        //System.out.println(a + b);
        //System.out.println((a+b+c) / 2);
        //System.out.println(Math.sqrt((a+b+c) / 2));
        double x = sc.nextDouble();
        double tu = Math.pow(Math.E, (StrictMath.sin(x) + 7));
        //double mau = x + StrictMath.log(x + Math.E*Math.E);
        System.out.println(tu);
    
        
    }
    
            
}
