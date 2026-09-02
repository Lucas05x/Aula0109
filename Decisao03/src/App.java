import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //entrada
        System.out.println("Digite o numero da base do retangulo:");
        double base = leitor.nextDouble();
        System.out.println("Digite o numero da altura do retangulo:");
        double altura = leitor.nextDouble();

        //processamento

        double area = base * altura;

        //saida

        System.out.println("A area do retangulo será: " + area);

        leitor.close();
    }
}
