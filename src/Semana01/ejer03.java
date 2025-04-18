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
public class ejer03 {
    public static void main(String[] args) {
        int a, b, c, resp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar a:");
        a=sc.nextInt();
        System.out.println("Ingresar b:");
        b=sc.nextInt();
        System.out.println("Ingresar c:");
        c=sc.nextInt();
        int may=a;
        if(may<b){
            may=b;
        }
        if(may<c){
            may=c;
        }
        System.out.println("El mayor es: "+may);
    }
}
