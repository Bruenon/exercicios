import java.util.Scanner;
public class brueno {

    public static void main(String[] args) {
        Pessoa bruno = new Pessoa("Bruno", 17);
        bruno.mudar_nome("Pedro");

    }
}

class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome_arg, int idade_arg){
        nome = nome_arg;
        idade = idade_arg;
    }
    public void mudar_nome(String noovo_nome){
        nome = noovo_nome;
    }
}
