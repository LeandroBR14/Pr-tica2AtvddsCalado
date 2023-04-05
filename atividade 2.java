/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 2. Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.
* Data: 4/4/2023
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um primeiro número: ");
        double numero1 = teclado.nextDouble();

        System.out.print("Digite um primeiro número: ");
        double numero2 = teclado.nextDouble();

        System.out.print("Digite um primeiro número: ");
        double numero3 = teclado.nextDouble();

        if (numero1 > numero2) {
            if (numero2 > numero3) {
                System.out.println(+numero1 +numero2 +numero3);
            }
        }

        teclado.close();
    }
}

// FALTA TERMINAR!!