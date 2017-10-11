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
public class Exercício17 {
    public static void main(String[] args) {
        
        Scanner conv = new Scanner(System.in);
        int decimal, modulo, aux;
        String binario = "";
        System.out.println("Digite um numero decimal: ");
        decimal = conv.nextInt();
        aux = decimal;

        while (decimal > 0) {
            modulo = (decimal % 2);
            binario = modulo + binario;
            decimal = decimal / 2;
        }
        System.out.println("O numero " + aux + " em base 10 é: " + binario + " na base 2");
    }
}
