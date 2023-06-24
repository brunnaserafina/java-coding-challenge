import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de andares da pirâmide");
        int quantity = scanner.nextInt();

        for (int i = 1; i <= quantity; i++){
            String convertToString = Integer.toString(i);
            System.out.println(convertToString.repeat(i));
        }

        //Resolução alternativa:
        for (int l = 1; l <= 5; l++) {
            for (int c = 1; c <= l; c++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
