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
public class alu1 {    
    public static void main(String[] args) {
        float a,b,c, prom;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar A");
        a=sc.nextInt();
        System.out.println("Ingresar B");
        b=sc.nextInt();
        System.out.println("Ingresar C");
        c=sc.nextInt();
        prom=(a+b+c)/3;
        System.out.println("El promedio es: "+prom);
    }
}
