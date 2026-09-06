import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = leitor.next();

        System.out.println("Digite o preço do produto: ");
        double preco = leitor.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade = leitor.nextInt();

        double total = quantidade * preco; 
        double desconto = 0.0;

        if (total > 200) {
            desconto = total * 5 / 100;
        }

        double valorfinal = total - desconto;

        System.out.println("---RESUMO---");

        System.out.print("Subtotal: R$: "+ total);

        System.out.println("Desconto: R$: "+ desconto); 
        
        System.out.println("Total a pagar: "+ valorfinal);

        leitor.close();
    }
}
