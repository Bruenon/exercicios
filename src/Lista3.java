import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        //For Exercício Fixação:
        int i;
        System.out.printf("Contagem Regressiva:\n");
        for (i = 10; i>-1; i--) {
            System.out.print(i+" ");
        }
        System.out.println("... Fogo!");

        //While Exercício Fixação:
        int senha;
        System.out.print("Digite a senha: ");
        senha = input.nextInt();
        while (senha!=0) {
            System.out.print("Tente novamente: ");
            senha = input.nextInt();
        }
        if (senha == 0) {
            System.out.println("Senha correta!");
        }

        //Do/While Exercício Fixação:
        int celsius, cancela, fahrenheit;
        do {
            System.out.printf("Digite a temperatura em Celsius: ");
            celsius = input.nextInt();
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%s° Celsius é equivalente a %s. Fahrenheit.\n", celsius, fahrenheit);
            System.out.println("Deseja finalizar o programa? Digite 0 ou 1.");
            cancela = input.nextInt();
        }
        while (cancela!=0); {
            System.out.printf("Programa finalizado.");
        }

        //Exercício 1:
        int senha;
        System.out.printf("Digite a senha: ");
        senha = input.nextInt();
        while (senha!=2002) {
            System.out.println("Senha Invalida");
            System.out.printf("Digite a senha novamente: ");
            senha = input.nextInt();
        }
            if (senha==2002) {
                System.out.print("Acesso Permitido");
            }

        //Exercício 2:
        int x, y;
        boolean verif = false;
        System.out.printf("Digite o valor de x: ");
        x = input.nextInt();
        System.out.printf("Digite o valor de y: ");
        y = input.nextInt();
        if (x>0 && y>0) {
            System.out.println("Essa coordenada pertence ao Primeiro Quadrante.");
        } else if (x<0 && y>0) {
            System.out.println("Essa coordenada pertence ao Segundo Quadrante.");
        } else if (x<0 && y<0) {
            System.out.println("Essa coordenada pertence ao Terceiro Quadrante.");
        } else if (x>0 && y<0) {
            System.out.println("Essa coordenada pertence ao Quarto Quadrante.");
        } else {
            verif = true;
        }
        while (verif = true) {
            break;
        }
        */
        //Exercício 3:
        int codigo, al, ga, di, fim;
        al = 0;
        ga = 0;
        di = 0;
        System.out.print("Digite o código: ");
        codigo = input.nextInt();
        while (cod!=4) {
            System.out.print("Digite o código: ");
            switch (codigo) {
                case 1 -> al++;
                case 2 -> ga++;
                case 3 -> di++;
            }
        }
        System.out.printf("Muito Obrigado!\nAlcool: %s\nGasolina: %s\nDiesel: %s", al, ga, di);
    }
}
