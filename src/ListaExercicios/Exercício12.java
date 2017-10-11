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
public class Exercício12 {
    public static void main(String[] args) {
       
        int ladox, ladoy, ladoz;
        int opcao = 1;
        while (opcao == 1) {
            Scanner s = new Scanner(System.in);
            System.out.println("Entre com o lado x:");
            ladox = s.nextInt();
            System.out.println("                           ");
            System.out.println("Entre com lado y:");
            ladoy = s.nextInt();
            System.out.println("                           ");
            System.out.println("Entre com lado z:");
            ladoz = s.nextInt();
            System.out.println("                           ");
            if ((ladox < ladoy + ladoz) && (ladoy < ladox + ladoz) && (ladoz < ladox + ladoy)) {
                if (ladox == ladoy && ladox == ladoz) {
                    System.out.println("Triangulo Equilatero");
                } else if ((ladox == ladoy) || (ladox == ladoz)) {
                    System.out.println("Triangulo Isosceles");
                } else {
                    System.out.println("Triângulo Escaleno");
                }
            } else {
                System.out.println("Não é triangulo!");
            }
            System.out.println("                             ");
            System.out.println("Continuar? 1 = sim, 2 = não");
            opcao = s.nextInt();
            System.out.println("                             ");
        }
        System.out.println("Até logo.");
    }
}
