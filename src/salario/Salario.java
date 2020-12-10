/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

/**
 *
 * @author deton
 */

import java.util.Scanner;

public class Salario {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            double salario, nvSalario;
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o seu salario atual: ");
    salario = ler.nextDouble();

    if(salario >= 500){
      nvSalario = salario * 1.15;
      System.out.println("seu novo salario será: " + nvSalario);
    }
    else
        if(salario >= 1000){
          nvSalario = salario * 1.125;
          System.out.println("seu novo salario será: " + nvSalario);
        }
        else{
          nvSalario = salario * 1.10;
          System.out.println("seu novo salario será: " + nvSalario);
        }
    }
    
}
