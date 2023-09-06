import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Exercício 1
        System.out.println("------Exercicio 1------");
        System.out.print("Digite um número: ");
        double numero = input.nextDouble();
        System.out.println("O número informado é:");
        if (numero > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        //Exercício 2
        System.out.println("------Exercicio 2------");
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        //Exercício 3
        System.out.println("------Exercicio 3------");
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
        System.out.println("------Exercicio 4------");
        int hora1, hora2, duracao;
        System.out.print("Digite quando começou o jogo: ");
        hora1 = input.nextInt();
        System.out.print("Digite quando o jogo terminou: ");
        hora2 = input.nextInt();
        duracao = hora2 - hora1;
        if (hora1 >= 1 && hora2 <= 24) {
            System.out.println("A duração do jogo foi de "+ Math.abs(duracao) +" horas.");
        } else {
            System.out.println("Você digitou um número de horas inválido.");
        }
        //Exercício 5 - fazer com if sem usar get!!
        System.out.println("------Exercicio 5------");
        int cod, quant;
        System.out.print("Digite o código: ");
        cod = input.nextInt();
        System.out.print("Qual a quantidade? ");
        quant = input.nextInt();
        if (cod == 1) {
            double pizza, resu;
            pizza = 4;
            resu = pizza * quant;
            System.out.printf("Você escolheu pizza com valor unitário de %sR$.\n", pizza);
            System.out.printf("O total a pagar é de %sR$.\n", resu);
        } else if (cod == 2) {
            double xburger, resu;
            xburger = 4.5;
            resu = xburger * quant;
            System.out.printf("Você escolheu Xburger com valor unitário de %sR$.\n", xburger);
            System.out.printf("O total a pagar é de %sR$.\n", resu);
        } else if (cod == 3) {
            double xbacon, resu;
            xbacon = 5;
            resu = xbacon * quant;
            System.out.printf("Você escolheu Xbacon com valor unitário de %sR$.\n", xbacon);
            System.out.printf("O total a pagar é de %sR$.\n", resu);
        } else if (cod == 4) {
            double xsalada, resu;
            xsalada = 2;
            resu = xsalada * quant;
            System.out.printf("Você escolheu Xsalada com valor unitário de %sR$.\n", xsalada);
            System.out.printf("O total a pagar é de %sR$.\n", resu);
        } else if (cod == 5) {
            double refri, resu;
            refri = 1.5;
            resu = refri * quant;
            System.out.printf("Você escolheu Refri com valor unitário de %sR$.\n", refri);
            System.out.printf("O total a pagar é de %sR$.\n", resu);
        } else {
            System.out.println("Código inválido.");
        }

        //Exercício 6 Faltou o fora do intervalo
        System.out.println("------Exercicio 6------");
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
        } else {
            System.out.println("Fora de intervalo.");
        }

        //Exercício 7 refazer conforme enunciado
        System.out.println("------Exercicio 7------");
        System.out.print("Digite o valor de X: ");
        float x = input.nextFloat();
        System.out.print("Digite o valor de Y: ");
        float y = input.nextFloat();

        if (x == 0 && y == 0) {
            System.out.println("Origem.");
        } else if (x == 0) {
            System.out.println("Eixo X.");
        } else if (y == 0) {
            System.out.println("Eixo Y.");
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
        System.out.println("------Exercicio 8------");
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
            resultado = (salario * 1.275);
            System.out.print(" Ou seja você vai pagar "+resultado+".");
        } else {
            System.out.println("Salário isento de imposto");
        }
    }
}