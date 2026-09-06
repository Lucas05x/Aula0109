import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Informe um numero:");
        double numero1 = leitor.nextDouble();

        System.out.println("Informe outro numero diferente:");
        double numero2 = leitor.nextDouble();

        double numeromaior;
        double numeromenor;

        
        if (numero1 > numero2) {

            numeromaior = numero1;
            numeromenor = numero2;

        } else { 
            numeromaior = numero2;
            numeromenor = numero1;
        }

        if (numeromaior == numeromenor) {

            System.out.println(" Favor inserir numeros diferente, numeros iguais nao podem ser aceitos! ");
            
        } else {
    
        System.out.println("O maior numero será: " + numeromaior);

        }

        leitor.close();


    }
}
