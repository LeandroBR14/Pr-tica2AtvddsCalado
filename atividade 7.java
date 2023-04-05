/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 7. Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação. 
* Data: 4/4/2023
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o mês: ");
        int mes = teclado.nextInt();

        switch(mes) {
            case 1: System.out.println("Janeiro - Verão");
            break;
            case 2: System.out.println("Fevereiro - Verão");
            break;
            case 3: System.out.println("Março - Verão");
            break;
            case 4: System.out.println("Abril - Outono");
            break;
            case 5: System.out.println("Maio - Outono");
            break;
            case 6: System.out.println("Junho - Outono");
            break;
            case 7: System.out.println("Julho - Primavera");
            break;
            case 8: System.out.println("Agosto - Primavera");
            break;
            case 9: System.out.println("Setembro - Primavera");
            break;
            case 10: System.out.println("Outubro - Inverno");
            break;
            case 11: System.out.println("Novembro - Inverno");
            break;
            case 12: System.out.println("Dezembro - Inverno");
            break;
            default: System.out.println("Não existe esse mês");
        }

        teclado.close();
    }
}