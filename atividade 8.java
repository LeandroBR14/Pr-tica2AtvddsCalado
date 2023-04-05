/* Nome do Aluno: Leandro Scalabrini
* RA: 32318945
* Nome do Programa: 8. Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%
* Data: 5/4/2023
*/

import java.io.Console;
import java.util.Scanner;
class Atividade8{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = teclado.nextDouble();

        System.out.println("-------------------------------------------");
        System.out.println("*ESCOLHA A FORMA DE PAGAMENTO*");
        System.out.println("Venda a vista ( TECLE VS )");
        System.out.println("Venda a Prazo 30 dias ( TECLE VP30 )");
        System.out.println("Venda a Prazo 60 dias ( TECLE VP60 )");
        System.out.println("Venda a Prazo 90 dias ( TECLE VP90 )");
        System.out.println("Venda com cartão de débito ( TECLE CD )");
        System.out.println("Venda com cartão de crédito ( TECLE CC )");
        System.out.println("-------------------------------------------");
        String formapagamento = teclado.next();

        if (formapagamento.equalsIgnoreCase("VS")) {
            double VFavista = valor - (valor*0.10);
            System.out.printf("O valor do produto com desconto é de %.2f", VFavista);
        } else if (formapagamento.equalsIgnoreCase("VP30")) {
            double VF30 = valor - (valor*0.05);
            System.out.printf("O valor do produto com desconto é de %.2f", VF30);
        } else if (formapagamento.equalsIgnoreCase("VP60")) {
            System.out.printf("O valor do produto é de %.2f", valor);
        } else if (formapagamento.equalsIgnoreCase("VP90")) {
            double VF90 = valor + (valor*0.05);
            System.out.printf("O valor do produto com juros é de %.2f", VF90);
        } else if (formapagamento.equalsIgnoreCase("CD")) {
            double VFDeb = valor - (valor*0.08);
            System.out.printf("O valor do produto com desconto é de %.2f", VFDeb);
        } else if (formapagamento.equalsIgnoreCase("CC")) {
            double VFCre = valor - (valor*0.07);
            System.out.printf("O valor do produto com desconto é de %.2f", VFCre);  
        } else {
            System.out.println("Tente novamente, digitando uma opção válida.");
        }

        teclado.close();
    }
}