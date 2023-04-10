import java.util.Scanner;

/* Nome do Aluno: Lukas santos rufino
* RA: 12723134472
* Data: 07/04/2023 */

public class App {
    public static void main(String[] args) throws Exception {
    int a, b, c = 0;
    Scanner s = new Scanner( System.in);
    System.out.println("digite dois numero");

    a = s.nextInt();

    b = s.nextInt();

    c = a + b;

    System.out.println("a soma dos numerosd e " + c );
    }
}
