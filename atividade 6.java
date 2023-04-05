/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 6. Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.
* Data: 4/4/2023
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas diárias você quer comprar? ");
        double diarias = teclado.nextDouble();

        if (diarias > 15) {
            double preco1 = (diarias * 5.50) + (diarias * 60);
            System.out.printf("A sua estádia ficou em: %.2f", preco1);
        } else if (diarias == 15) {
            double preco2 = (diarias * 6) + (diarias * 60);
            System.out.printf("A sua estádia ficou em: %.2f", preco2);
        } else if (diarias < 15) {
            double preco3 = (diarias * 8) + (diarias * 60);
            System.out.printf("A sua estádia ficou em: %.2f", preco3);
        }

        teclado.close();
    }
}