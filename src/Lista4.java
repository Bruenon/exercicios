import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 1
        System.out.println("------Exercicio 1------");
        int n1;
        System.out.print("Digite um número inteiro: ");
        n1 = sc.nextInt();
        if (n1 <= 1000) {
            for (int i = 1; i <= n1; i++) {
                if (i % 2 != 0) {
                    System.out.printf("Números impares de 1 a %s = %s\n", n1, i);
                }
            }
        } else {
            System.out.println("Código Inválido.");
        }

        // Exercício 2
        System.out.println("------Exercicio 2------");
        System.out.print("Digite um número inteiro: ");
        int n2 = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i <= n2; i++) {
            System.out.print("Digite um valor: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.printf("\tin: %s\n\tout: %s\n", in, out);

        // Exercício 3
        System.out.println("------Exercicio 3------");
        System.out.print("Digite um número: ");
        int n3 = sc.nextInt();
        for (int i = 0; i < n3; i++) {
            System.out.print("Digite o Valor do caso:");
            float caso1 = sc.nextFloat();
            System.out.print("Digite o Valor do caso:");
            float caso2 = sc.nextFloat();
            System.out.print("Digite o Valor do caso:");
            float caso3 = sc.nextFloat();

            float media = ((caso1 * 2) + (caso2 * 3) + (caso3 * 5)) / 3;
            System.out.printf("Média Ponderada = %.1f\n", media);
            if (caso1 == 0 && caso2 == 0 && caso3 == 0) {
                break;
            }
        }

        // Exercicio 4
        System.out.println("------Exercicio 4------");
        System.out.print("Digite um número: ");
        float n4 = sc.nextFloat();
        for (int i = 0; i < n4; i++) {
            System.out.print("Digite um número: ");
            float n5 = sc.nextFloat();
            float div = n4 / n5;
            if (n5 == 0) {
                System.out.printf("Divisão Impossível.");
            } else {
                System.out.printf("A Divisão entre %s e %s é igual a %s\n", n4, n5, div);
            }
        }

        // Exercício 5
        System.out.println("------Exercicio 5------");
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int variavel = 1;
        for (int i = num; i > 1; i--) {
            variavel = i * variavel;
            System.out.printf("O fatorial de %s é %s.\n", num, variavel);
        }
        
        // Exercício 6
        System.out.println("------Exercicio 6------");
        System.out.print("Digite um número inteiro: ");
        int num2 = sc.nextInt();
        int div = 0;
        for (int i = 1; i < num2 ;i++) {
            div = num2 / i;
            if (num2 % i == 0) {
            System.out.printf("Seus divisores são: %s, %s\n", div, num2 % i);
            }
        }

        //Exercício 7
        System.out.println("------Exercicio 7------");
        System.out.print("Digite um número positivo: ");
        int num3 = sc.nextInt();
        System.out.printf("O número digitado foi: %s\n", num3);
        for (int i = 1; i <= num3; i++) {
            double quadrado, cubo;
            quadrado = Math.pow(i, 2);
            cubo = Math.pow(i, 3);
            System.out.printf("%s.  Quadrado: %s, Cubo: %s\n", i, quadrado, cubo);
        }

        sc.close();
    }
}
