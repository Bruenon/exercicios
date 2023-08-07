package Aula43;
import java.util.Scanner;

public class Aula43 {

    public static void main(String[] args) {
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
    }
}