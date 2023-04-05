/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 3. Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo.
* Data: 4/4/2023
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("O  número é positivo.");
        } if (numero < 0) {
            System.out.println("O  número é negativo.");
        } if (numero % 2 == 0) {
            System.out.println("O  número é par.");
        } else {
            System.out.println("O  número é ímpar.");
        }
        teclado.close();
    }
}