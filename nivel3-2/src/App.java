import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite 1 numero inteiro");
        int numero = leitor.nextInt();

        if (numero >= 0 ) {
            System.out.println("O Numero informado é positivo");           
        } else { 
            System.out.println("O numero é negativo");
        }



        leitor.close();
    }
}
