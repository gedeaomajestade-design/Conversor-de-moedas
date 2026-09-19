import java.util.Scanner;
public class Conversordemoeda {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        double dolar = 5.40;
        double euro = 6.35;
        double kz = 0.0060;
        System.out.println("=======================================");
        System.out.println("          Conversor de Moedas    ");
        System.out.println("=======================================");

        System.out.println("1- Real (BRL) ");
        System.out.println("2- Dolar (USB) ");
        System.out.println("3 - Euro (EUR) ");
        System.out.println("4- kwanzas (AOA) ");

        System.out.println("\n Escolha uma opcao");
        int opcao = sc.nextInt();

        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();
        System.out.println("Esolha a moeda de origem: ");
        int origem = sc.nextInt();
        System.out.println("Esolha o destino ");
        int destino= sc.nextInt();

        double valorEmreal = 0;
        double resultado = 0 ;

        switch (origem){
            case 1:
                valorEmreal = valor;
                break;
            case 2:
                valorEmreal = valor * dolar;
                break;
            case 3:
                valorEmreal = valor * euro;
                break;
            case 4:
                valorEmreal = valor * kz;
            default:
                System.out.println("    Moeda de Origem invalioda  ");
        }
        switch(destino){
            case 1:
                resultado =valorEmreal;
                System.out.printf("%.2f BRL%n", resultado);
                break;
            case 2:
                resultado =valorEmreal / dolar;
                System.out.printf("%.2f USB%n", resultado);
                break;
            case 3:
                resultado =valorEmreal / euro;
                System.out.printf("%.2f EUR%n", resultado);
                break;
            case 4:
                resultado =valorEmreal / kz;
                System.out.printf("%.2f AOA%n", resultado);
                break;
        }

    }
}