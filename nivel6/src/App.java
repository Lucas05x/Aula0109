import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite a quantidade de km rodados:");
        double kms = leitor.nextDouble();

        System.out.println("Digite a quantidade de litros gastos:");
        double litros = leitor.nextDouble();

        double consumo = kms / litros; 

        if (consumo >= 12 ) {
            System.out.println("Consumo economico");
            
        } else { 
            System.out.println("Consumo elevado");            
        }

        leitor.close();

    }
}
