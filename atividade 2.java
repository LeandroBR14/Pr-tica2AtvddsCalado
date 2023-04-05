/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 2. Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.
* Data: 4/4/2023
*/

import java.util.Scanner;
class Atividade2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um primeiro número: ");
        double a = teclado.nextDouble();

        System.out.print("Digite um segundo número: ");
        double b = teclado.nextDouble();

        System.out.print("Digite um terceiro número: ");
        double c = teclado.nextDouble();

        if (a <= b && a <= c) {
            if (b <= c) {
               System.out.println(a + ", " + b + ", " + c);
            } else {
               System.out.println(a + ", " + c + ", " + b);
            }
         } else if (b <= a && b <= c) {
            if (a <= c) {
               System.out.println(b + ", " + a + ", " + c);
            } else {
               System.out.println(b + ", " + c + ", " + a);
            }
         } else {
            if (a <= b) {
               System.out.println(c + ", " + a + ", " + b);
            } else {
               System.out.println(c + ", " + b + ", " + a);
            }

        teclado.close();
         }
    }    
}
