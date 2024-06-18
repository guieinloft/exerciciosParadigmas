import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;

class Entrevistado{
    private double salario;
    private int filhos;

    public Entrevistado(double salario, int filhos){
        this.salario = salario;
        this.filhos = filhos;
    }

    public double getSalario(){
        return this.salario;
    }
    
    public int getFilhos(){
        return this.filhos;
    }
}

public class ex1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double auxS;
        int auxF;
        Collection<Entrevistado> entrevistados = new ArrayList<>();
        while(true){
            System.out.print("Digite o salário: ");
            auxS = s.nextDouble();
            if(auxS < 0) break;
            System.out.print("Digite o número de filhos: ");
            auxF = s.nextInt();
            Entrevistado e = new Entrevistado(auxS, auxF);
            entrevistados.add(e);
        }

        double mediaSalario = entrevistados.stream()
                .mapToDouble(Entrevistado::getSalario).average().getAsDouble();

        System.out.printf("Média de salário: %.2f\n", mediaSalario);

        double mediaFilhos = entrevistados.stream()
                .mapToInt(Entrevistado::getFilhos).average().getAsDouble();
        
        System.out.printf("Média de filhos: %.1f\n", mediaFilhos);

        double maiorSalario = entrevistados.stream()
                .mapToDouble(Entrevistado::getSalario).max().getAsDouble();
        
        System.out.printf("Maior salário: %.2f\n", maiorSalario);

        double pcSalario = entrevistados.stream()
                .filter(e -> e.getSalario() <= 1000.0).count()
                / (double)entrevistados.size() * 100;
        
        System.out.printf("Porcentagem de pessoas com salário até 1000,00: %.1f%%\n", pcSalario);
    }
}
