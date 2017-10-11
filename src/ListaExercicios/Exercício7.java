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
public class Exercício7 {
    public static void main(String[] args) {
      
        int n1;
        int n2;
        String Operacao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a operação que deseja efetuar: ");
        Operacao = entrada.next();        

        System.out.println("Digite o Primeiro Numero: ");
        n1 = entrada.nextInt();

        System.out.println("Digite o Segundo Numero: ");
        n2 = entrada.nextInt();
        
        switch (Operacao){
            case "+":
                System.out.println("O resultado da Soma é: " + (n1+n2));
            case "-":
                System.out.println("O resultado da subtração é: " + (n1-n2));
            case "/":
                System.out.println("O resultado da divisão é: " + (n1/n2));
            case "*":
                System.out.println("O resultado da multiplicação é: " + (n1*n2));
            }
        
    }
}
