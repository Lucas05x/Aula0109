import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


 // 1. Entradas: leia aqui os dados necessários para o exercício

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Digite sua cidade: ");
        String cidade = leitor.nextLine();

 // 4. Saída: exiba aqui o resultado de forma clara

        System.out.println("O usuário " + nome + " tem " + idade + " anos de idade e mora na cidade com o nome de: " + cidade);



 leitor.close();
 }
}