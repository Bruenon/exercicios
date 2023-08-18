import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Exercício 1
        System.out.print("Digite um número: ");
        double numero = input.nextDouble();
        System.out.println("O número informado é:");
        if (numero > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        //Exercício 2
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        //Exercício 3
        double A, B;
        System.out.println("Digite dois números: ");
        A = input.nextLong();
        B = input.nextLong();
        System.out.println("Os números informados foram "+A+" e "+B);
        if (A % B == 0) {
            System.out.println("Eles são multiplos.");
        } else if (B % A == 0) {
            System.out.println("Eles são multiplos.");
        } else {
            System.out.println("Eles não são multiplos.");
        }

        //Exercício 4
        int hora1, hora2, duracao;
        System.out.print("Digite quando começou o jogo: ");
        hora1 = input.nextInt();
        System.out.print("Digite quando o jogo terminou: ");
        hora2 = input.nextInt();
        duracao = hora2 - hora1;
        if (hora1 >= 1 && hora2 <= 24) {
            System.out.println("A duração do jogo foi de "+ duracao +" horas.");
        } else {
            System.out.println("Você digitou um número de horas inválido.");
        }
        //Exercício 5
        Map<Integer, Double> produtos = new HashMap<>();
        produtos.put(1, 4.0);
        produtos.put(2, 4.5);
        produtos.put(3, 5.0);
        produtos.put(4, 2.0);
        produtos.put(5, 1.5);

        System.out.print("Digite o código do produto: \n");
        int codigoProduto = input.nextInt();
        switch (codigoProduto) {
            case 1 -> System.out.println("Você escolheu Pizza com preço unitário de R$4.0.");
            case 2 -> System.out.println("Você escolheu Xburguer com preço unitário de R$4.5.");
            case 3 -> System.out.println("Você escolheu Xbacon com preço unitário de R$5.0.");
            case 4 -> System.out.println("Você escolheu Xsalada com preço unitário de R$2.0.");
            case 5 -> System.out.println("Você escolheu Refri com preço unitário de R$1.5.");
            default -> System.out.println("Você digitou um código inválido! Digite um código de 1 a 5.");
        }

        System.out.print("Digite a quantidade: \n");
        int quantidade = input.nextInt();

        Double precoUnitario = produtos.get(codigoProduto);
        if (precoUnitario != null) {
            double precoFinal = precoUnitario * quantidade;
            System.out.printf("O preço final é: R$%.2f%n", precoFinal);
        } else {
            System.out.println("Código de produto inválido.");
        }

        //Exercício 6
        System.out.print("Digite um número: ");
        long valor = input.nextLong();
        if (valor >= 0 && valor <= 25) {
            System.out.println("O número está entre 0 e 25");
        } else if (valor >= 25 && valor <= 50) {
            System.out.println("O número está entre 25 e 50");
        } else if (valor >= 50 && valor <= 75) {
            System.out.println("O número está entre 50 e 75");
        } else if (valor >= 75 && valor <= 100) {
            System.out.println("O número está entre 75 e 100");
        }

        //Exercício 7
        System.out.print("Digite o valor de X: ");
        float x = input.nextFloat();
        System.out.print("Digite o valor de Y: ");
        float y = input.nextFloat();

        if (x == 0 || y == 0) {
            System.out.println("Está no eixo.");
        } else if (x > 0 && y > 0) {
            System.out.println("1° Quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("2° Quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("3° Quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("4° Quadrante.");
        }

        //Exercício 8
        double salario, resultado;
        System.out.print("Digite o seu salário: ");
        salario = input.nextDouble();

        if (salario >= 1903.99 && salario <=2826.65) {
            System.out.print("Você deve pagar 7.5% de imposto.");
            resultado = (salario * 7.5) / 100;
            System.out.print(" Ou seja você vai pagar "+resultado+".");
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Você deve pagar 15% de imposto.");
            resultado = (salario * 15) / 100;
            System.out.print(" Ou seja você vai pagar "+resultado+".");
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("Você deve pagar 22,5% de imposto.");
            resultado = (salario * 22.5) / 100;
            System.out.print(" Ou seja você vai pagar "+resultado+".");
        } else if (salario > 4664.68) {
            System.out.println("Você deve pagar 27,5% de imposto.");
            resultado = (salario * 2) / 100;
            System.out.print(" Ou seja você vai pagar "+resultado+".");
        } else {
            System.out.println("Salário Baixo.");
        }
    }
}