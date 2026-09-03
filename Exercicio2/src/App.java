import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);
        //entrada;
    
        System.out.println("Digite a temperatura em graus:");
        double temperatura = leitor.nextDouble(); 

        //processamento;

        double F = temperatura * 9.0 / 5.0 + 32;

        //saida;

        System.out.println ("Convertendo a temperatura de " + temperatura + "°C para Farenheit o resultado será 50" + F +"°F" );

        leitor.close();
    }
}
