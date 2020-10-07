import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro e positivo");

        int num = sc.nextInt();

        if (num < 0) {
            sc.close();
            throw new Exception("Número deve ser maior que 0");
        }

        double result = 0;

        for (int i = 1; i <= num; i++) {
            result += (double) (1.0 / i);
        }

        System.out.println(result);

        sc.close();
    }
}
