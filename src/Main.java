import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int x =1; x<= 3;x++) {

            System.out.println("qual o nome do aluno " +x+ "?");
            String nome = scanner.next();
            System.out.println("qual email do aluno " +x+ "?");
            String email = scanner.next();
            System.out.println("quais as notas do aluno " +x+ "?");
            Double nota1 = scanner.nextDouble();
            Double nota2 = scanner.nextDouble();
            Double nota3 = scanner.nextDouble();
            Double media = (nota1+nota2+nota3)/3;
            System.out.println("----- aluno " +x+ "-----" );
            System.out.println("Nome: " + nome);
            System.out.println("email: " + email);
            System.out.println("nota 1: " + nota1);
            System.out.println("nota 2: " + nota2);
            System.out.println("nota 3: " + nota3);
            System.out.println("media: " + media);
            //operador
            if (media >= 6 ) {
                System.out.println("aprovado");
            } else {
                System.out.println("reprovado");
            }
            System.out.println("-----------------");
        }

    }
}


