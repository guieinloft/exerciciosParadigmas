import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private int codigo;
    private double preco;

    public Produto(int codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
    }

    public double getPrecoComAumento() {
        return preco * 1.20;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Novo Preço: " + getPrecoComAumento();
    }
}

public class Ex5 {
    public static void ex5(){
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.print("Digite o código do produto (negativo para sair): ");
            int codigo = scanner.nextInt();
            if (codigo < 0) {
                break;
            }

            System.out.print("Digite o preço de custo do produto: ");
            double preco = scanner.nextDouble();

            produtos.add(new Produto(codigo, preco));
        }


        produtos.stream()
                .map(Produto::toString)
                .forEach(System.out::println);

        double mediaPrecos = produtos.stream()
                .mapToDouble(Produto::getPrecoComAumento)
                .average()
                .orElse(0.0);

        System.out.printf("Média dos preços dos produtos após aumento: %.2f%n", mediaPrecos);

        scanner.close();
    }
}
