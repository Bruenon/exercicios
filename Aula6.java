import java.util.Scanner;

public class Aula6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Exercício 5
        /*
        System.out.print("Digite a peça 1: ");
        int codPeca1=input.nextInt();
        System.out.print("Digite a quantidade da peça 1: ");
        int quantPeca1=input.nextInt();
        System.out.print("Digite valor unitario da peça 1: ");
        double valorPeca1=input.nextDouble();

        System.out.print("Digite a peça 2: ");
        int codPeca2=input.nextInt();
        System.out.print("Digite a quantidade da peça 2: ");
        int quantPeca2=input.nextInt();
        System.out.print("Digite valor unitario da peça 2: ");
        double valorPeca2=input.nextDouble();

        double valorPago=(valorPeca1*quantPeca1)+(valorPeca2*quantPeca2);
        System.out.println("Total "+valorPago);
        input.close();
        */
        //Exercício 6
        System.out.print("valor A: ");
        float A = input.nextFloat();
        System.out.print("valor B: ");
        float B = input.nextFloat();
        System.out.print("valor C: ");
        float C = input.nextFloat();

        float lado1 = A, lado2 = B, altura = C;
        //A)
        float area = lado1*altura/2;
        System.out.println("Area do triangulo retangulo: "+area);
        //B)
        double pi=3.14159, raio=C, areac = (C*C)*pi;
        System.out.printf("\n\t%f^2 . pi = %f", raio, areac);
        //C)
        float areaT = ((lado1 + lado2) * altura) /2;
        System.out.printf("\n\t((%f + %f) * %f) / 2 = %f", lado1, lado2, altura, areaT);
        //D)
        float areaQ = lado2*lado2;
        System.out.printf("\n\t%f^2 = %f", lado2, areaQ);
        //E)
        float areaR = lado1 * lado2;
        System.out.printf("%f . %f = %f", lado1, lado2, areaR);
    }
}