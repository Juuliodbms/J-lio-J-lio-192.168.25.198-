/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaExercicios;

/**
 *
 * @author Júlio
 */
public class Exercício6 {
     public static void main(String[] args) {
        Scanner numeroEntrada = new Scanner (System.in);
        System.out.println("Digite um numero: "); 
        int i = numeroEntrada.nextInt();
        if (i % 2 == 0){
        System.out.println(i + " O numero é par");
        } else{
        System.out.println(i + " O numero é impar");}
}
}
