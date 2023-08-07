import java.util.Scanner;

public class Aula3{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();


        print("My name is %s and I Am %s years old.", nome);
    }

    static void print(String str, Object ... args){
        System.out.printf(str, args);
    }
}
