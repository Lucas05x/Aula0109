import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        //entrada

        System.out.println("Digite a 1º nota: ");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a 2º nota: ");
        double nota2 = leitor.nextDouble();

        //processamento

        double media = nota1 + nota2 / 2;

        //decisao

        if (media >= 7) {

            System.out.println("Aprovado!");
        } else {

            System.out.println("Em recuperação ");
        }

       

    
    }
}
