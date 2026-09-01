import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner leitor = new Scanner (System.in);    

    //entrada;
    System.out.print("DIGITE SEU NOME");
    String nome = leitor.next ();
    System.out.println("DIGITE SUA IDADE:");
    int idade = leitor.nextInt();
    
    //SAIDA

    System.out.println("Óla, " + nome + ", você tem " + idade + " anos.");
    }
}
