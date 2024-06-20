import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static void ex4(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Número %d: ", i + 1);
            numeros.add(scanner.nextInt());
        }

        int count0To25 = (int) numeros.stream()
                .filter(n -> n >= 0 && n <= 25)
                .count();


        int count26To50 = (int) numeros.stream()
                .filter(n -> n >= 26 && n <= 50)
                .count();

        int count51To75 = (int) numeros.stream()
                .filter(n -> n >= 51 && n <= 75)
                .count();

        int count76To100 = (int) numeros.stream()
                .filter(n -> n >= 76 && n <= 100)
                .count();

        System.out.printf("Quantidade de números no intervalo [0, 25]: %d%n", count0To25);
        System.out.printf("Quantidade de números no intervalo [26, 50]: %d%n", count26To50);
        System.out.printf("Quantidade de números no intervalo [51, 75]: %d%n", count51To75);
        System.out.printf("Quantidade de números no intervalo [76, 100]: %d%n", count76To100);

        scanner.close();
    }
}
