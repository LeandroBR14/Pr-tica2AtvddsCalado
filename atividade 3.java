/*Faça um programa que leia o nome, o sobrenome, a idade, em anos, e a naturalidade (cidade de nascimento) de uma pessoa. Depois, o programa deve dar
a seguinte opção “Deseja visualizar dados completos?”. Se o caractere digitado pelo usuário for ‘S’ o programa deve imprimir na tela Nome, Sobrenome,
idade e naturalidade. Se o caractere digitado pelo usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se o caractere não for nenhuma das outras
opções acima o programa deve imprimir “Digitação errada. Tente Novamente”.*/

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = teclado.next();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = teclado.next();

        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Digite a cidade de seu nascimento (naturalidade): ");
        String nat = teclado.next();

        System.out.print("Deseja visualizar os dados completos? (Digite S ou N) ");
        String escolha = teclado.next();

        if (escolha.equalsIgnoreCase("s")) {
            System.out.printf("Nome: " +nome);
            System.out.println("Sobrenome: " +sobrenome);
            System.out.println("Idade: " +idade);
            System.out.println("Naturalidade: " +nat);

        } else if (escolha.equalsIgnoreCase("n")) {
            System.out.println("Nome: " +nome);
            System.out.println("Idade: " +idade);
        } else {
            System.out.println("Digitação errada. Tente Novamente");
        }

        teclado.close();
    }
}