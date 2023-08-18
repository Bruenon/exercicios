package Lista1;

import java.util.Scanner;

public class Lista1{

    public static void main(String[] args) {

        //Aula 1
        System.out.println("My name is Bruno and I Am 17 years old.");

        //Aula 2
        int x = 1;

        System.out.println("x");

        //Aula 3
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        int idade = input.nextInt();
        System.out.print("My name is %s and I Am %s years old.", nome, idade);

        //Aula 4
        //Exercício 1
        int x=5;
        float z=2f, y;
        y=x*5/z;

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        var resultado = (double) x/y;

        System.out.println(resultado);*/

        double pi=3.1416, d=2.0;
        double perimetro=pi*d;
        System.out.printf("%.2f",perimetro);

        //Exercício 2
        double a=1.0, b;

        b=a;

        System.out.println(b);

        //Exercício 3

        Scanner input = new Scanner(System.in);
        String palavra; int num;
        System.out.print("Digite um nome de um gay: ");
        palavra = input.next();
        System.out.println("O nome digitado foi: " + palavra);
        System.out.print("Digite outro nome e um número inteiro: ");
        palavra = input.next();
        num=input.nextInt();
        System.out.println("Você digitou: " + palavra +" "+ num);
        input.close();

        //Aula 5
        Scanner input = new Scanner(System.in);

        Exercício 1
        double x,y, soma;
        x=input.nextInt();
        y=input.nextInt();
        soma=x+y;
        System.out.println("O resultado foi "+soma);

        //Exercício 2
        double pi,r,d,resultado;
        pi=3.14;
        r=input.nextInt();
        d=input.nextInt();
        resultado=d/r*pi;
        System.out.println("Valor da area deste circulo: "+resultado);

        //Exercício 3
        int A,B,C,D,resultado;
        System.out.print("Digite A: "); A=input.nextInt();
        System.out.print("Digite B: "); B=input.nextInt();
        System.out.print("Digite C: "); C=input.nextInt();
        System.out.print("Digite D: "); D=input.nextInt();
        resultado=(A*B)-(C*D);
        System.out.println("O resultado foi "+resultado);

        //Exercício 4
        double N,H,V,Multiplicacao;
        N=input.nextInt();
        H=input.nextInt();
        V=input.nextInt();
        Multiplicacao=H*V;
        System.out.println("Funcionario numero "+N+" e tem um salario de "+Multiplicacao+"R$");

        //Exercício 5
        Scanner input = new Scanner(System.in);
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