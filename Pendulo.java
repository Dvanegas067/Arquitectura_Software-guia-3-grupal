/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendulo;

import java.util.Scanner;

/**
 *
 * @author bd0005
 */
public class Pendulo {
    
     private double l;
     private double a;
     private Scanner entrada = new Scanner(System.in);

    public Pendulo() {

    }

    public Pendulo(double l, double a) {
        this.l = l;
        this.a = a;
    }
    public void datos(){
        
        System.out.println("ingresa la longitud de la cuerda");
        l = entrada.nextInt();

        System.out.println("ingresa la aceleracion del pendulo ");
        a = entrada.nextInt();
    }

    public void oscilacion() {
        System.out.println("el resultado de la oscilacion es ");
        System.out.println(2 * Math.PI * (Math.sqrt(a / l)));
    
    }   
    

    public double getL() {
        
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}


   
    
    

