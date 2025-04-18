/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class ejer02 {
    public static void main(String[] args) {
        int a, b, resp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar a:");
        a=sc.nextInt();
        System.out.println("Ingresar b:");
        b=sc.nextInt();
        resp=a+b;
        System.out.println("La suma es "+a+" + "+b+" = "+resp);
    }
}
