import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Aluno{
    private double n1;
    private double n2;
    private double n3;

    public Aluno(double n1, double n2, double n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    
    public double getN1(){
        return n1;
    }
    public double getN2(){
        return n2;
    }
    public double getN3(){
        return n3;
    }

    public void aplicaPeso(){
        if(n1 > n2 && n1 > n3){
            n1 = n1 * 4;
            n2 = n2 * 3;
            n3 = n3 * 3;
        }
        else if (n2 > n1 && n2 > n3){
            n1 = n1 * 3;
            n2 = n2 * 4;
            n3 = n3 * 3;
        }
        else{
            n1 = n1 * 3;
            n2 = n2 * 3;
            n3 = n3 * 4;
        }
    }
}

public class Ex3{
    public static void ex3(){
        double n1, n2, n3;
        Collection<Aluno> alunos = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("Digite a nota 1: ");
            n1 = s.nextDouble();
            System.out.print("Digite a nota 2: ");
            n2 = s.nextDouble();
            System.out.print("Digite a nota 3: ");
            n3 = s.nextDouble();
            alunos.add(new Aluno(n1, n2, n3));
        }
        alunos.forEach(a -> {
            System.out.println("Nota 1: " + a.getN1() + " Nota 2: " + a.getN2() + " Nota 3: " + a.getN3());
            a.aplicaPeso();
            double media = Arrays.asList(a.getN1(), a.getN2(), a.getN3()).stream().reduce(0.0, Double::sum) / 10;
            System.out.println("Média: " + media);
            System.out.println(media >= 5.0 ? "Aprovado." : "Reprovado.");
        });
    }
}
