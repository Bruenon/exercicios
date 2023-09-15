import java.util.Scanner;

public class Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercício 1
        System.out.print("\t0 sair\n\t1\tPizza" +
        "\n\t2\tXburger" +
        "\n\t3\tXbacon" +
        "\n\t4\tXsalada" +
        "\n\t5\tRefri\n");
        boolean sair = false;
        double total = 0;
        while (!sair) {
            System.out.print("\ncodigo do pedido: ");
            int cod = sc.nextInt();
            if (cod == 0) {
            break;
            }
        System.out.print("\ndigite a quantidade: ");
        int quant = sc.nextInt();
        double preco = 0;

        switch (cod) {
            case 1:
                preco = quant * 4;
                System.out.printf("voce pediu %s de Pizza isso vai custar %s\n", quant, preco);
                break;
            case 2:
                preco = quant * 4.5;
                System.out.printf("voce pediu %s de Xburger isso vai custar  %.2f\n", quant, preco);
                break;
            case 3:
                preco = quant * 5;
                System.out.printf("voce pediu %s de Xbacon isso vai custar  %s\n", quant, preco);
                break;
            case 4:
                preco = quant * 2;
                System.out.printf("voce pediu %s de Xsalada isso vai custar  %s\n", quant, preco);
                break;
            case 5:
                preco = quant * 1.5;
                System.out.printf("voce pediu %s de Refri isso vai custar  %.2f\n", quant, preco);
                break;
            default:
                System.out.println("digite um codigo valido");
                break;
        }
        if (preco != 0) {
            System.out.println("deseja adicionar esse pedido? ");
            char resp = sc.next().strip().charAt(0);
            switch (resp) {
                case 's' -> total += preco;
                case 'n' -> System.out.println("");
                default -> System.out.println("");
            }
        }
        System.out.printf("vc vai pagar %.2f", total);
    }
        //Exercício 2
        double num1, num2;
        System.out.printf("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Porcentagem\n6. Raiz\n7. Potência\n");
        System.out.println("Digite o Código da Operação: ");
        int codigo = sc.nextInt();
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();
        switch (codigo) {
            case 1:
                System.out.println("Você escolheu Soma.");
                System.out.printf("A soma de %s e %s é %s.", num1, num2, num1+num2);
                break;
            case 2:
                System.out.println("Você escolheu Subtração.");
                System.out.printf("Subtração de %s e %s é %s.", num1, num2, num1-num2);
                break;
            case 3:
                System.out.println("Você escolheu Multiplicação.");
                System.out.printf("A Multiplicação de %s e %s é %s.", num1, num2, num1*num2);
                break;
            case 4:
                System.out.println("Você escolheu Divisão.");
                System.out.printf("A Divisão de %s e %s é %s.", num1, num2, num1/num2);
                break;
            case 5:
                System.out.println("Você escolheu Porcentagem.");
                System.out.printf("%s de %s é %s.", num1, num2, (num1*num2)/100);
                break;
            case 6:
                System.out.println("Você escolheu Raiz.");
                System.out.printf("A Raiz Quadrada dos números %s e %s são respectivamente: %s e %s.", num1, num2, Math.sqrt(num1), Math.sqrt(num2));
                break;
            case 7:
                System.out.println("Você escolheu Potência.");
                System.out.printf("O número %s elevado a %s é %s.", num1, num2, Math.pow(num1, num2));
                break;
        }
    }
}