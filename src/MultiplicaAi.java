import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MultiplicaAi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que deseja ver a tabela de multiplicação");
        int value = scanner.nextInt();
        int i = 1;

        System.out.println("Tabela de multiplicação de " + value);

        while (i <= 10) {
            System.out.println(value + "x" + i + " = " + (value * i));
            i++;
        }

    }
}