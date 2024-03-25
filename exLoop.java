import java.util.Scanner;
import java.util.LinkedList;

class Funcionario{
    private String nome;
    private int horas;
    private int dep;
    public Funcionario(String nome, int horas, int dep){
        this.nome = nome;
        this.horas = horas;
        this.dep = dep;
    }
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        int sbruto = horas * 12 + dep * 40;
        double salario = sbruto - (sbruto * (0.085 + 0.05));
        return salario;
    }
}

class Entrevistado{
    String sexo;
    int idade;
    int livros;
    public Entrevistado(String sexo, int idade, int livros){
        this.sexo = sexo;
        this.idade = idade;
        this.livros = livros;
    }
}

class Produto{
    int id;
    double valor;
    double percentual;
    public Produto(int id, double valor, double percentual){
        this.id = id;
        this.valor = valor;
        this.percentual = percentual;
    }
    public double getNovoValor(){
        return (valor * (1+percentual/100));
    }
}

public class exLoop{
    public static void ex1(){
        double soma = 0;
        for(int i = 0; i < 50; i++){
            soma += (double)(2*i+1)/(i+1);
        }
        System.out.println(soma);
    }

    public static void ex2(Scanner entrada){
        int num, soma = 0, contador = 0;
        while(true){
            num = entrada.nextInt();
            if(num <= 0) break;
            soma += num;
            contador++;
        }
        System.out.println((float)soma/contador);
    }

    public static void ex3(Scanner entrada){
        int num, spar=0, simpar=0, cpar=0, cimpar=0;
        for(int i = 0; i < 10; i++){
            num = entrada.nextInt();
            if(num % 2 == 0){
                spar += num;
                cpar++;
            } else {
                simpar += num;
                cimpar++;
            }
        }
        System.out.println("Pares: " + cpar + " Impares: " + cimpar);
        System.out.println(spar + " " + (double)simpar/cimpar);
    }

    public static void ex4(Scanner entrada){
        LinkedList<Funcionario> lfunc = new LinkedList<Funcionario>();
        for(int i = 0; i < 2; i++){
            System.out.println("Digite o nome: ");
            String nome = entrada.nextLine();
            System.out.println("Digite o n de horas: ");
            int horas = entrada.nextInt();
            System.out.println("Digite o n de dependentes: ");
            int dep = entrada.nextInt();
            entrada.nextLine();
            Funcionario func = new Funcionario(nome, horas, dep);
            lfunc.add(func);
        }
        for(Funcionario func : lfunc){
            System.out.println("Nome: " + func.getNome() + "\nSalario: " + func.getSalario());
        }
    }

    public static void ex5(Scanner entrada){
        LinkedList<Entrevistado> lista = new LinkedList<Entrevistado>();
        while(true){
            System.out.println("Digite o sexo: ");
            String sexo = entrada.nextLine();
            System.out.println("Digite a idade: ");
            int idade = entrada.nextInt();
            if(idade < 0) break;
            System.out.println("Digite o n de livros lidos: ");
            int livros = entrada.nextInt();
            entrada.nextLine();
            Entrevistado ent = new Entrevistado(sexo, idade, livros);
            lista.add(ent);
        }
        int qtdlivrosm10 = 0, qtdmulheres = 0, qtdhomens = 0, sidadehomens = 0, qtd0livros = 0, qtdtotal = 0;
        double media;
        double percent0;
        for(Entrevistado e : lista){
            qtdtotal++;
            if(e.idade < 10) qtdlivrosm10 += e.livros;
            if(e.sexo.equals("F") && e.livros >= 5) qtdmulheres++;
            if(e.sexo.equals("M") && e.livros < 5){
                sidadehomens += e.idade;
                qtdhomens++;
            }
            if(e.livros == 0) qtd0livros++;
        }
        media = (float)sidadehomens/qtdhomens;
        percent0 = (float)qtd0livros * 100.0 / qtdtotal;
        System.out.println(qtdlivrosm10 + "\n" + qtdmulheres + "\n" + media + "\n" + percent0);
    }

    public static void ex6(Scanner entrada){
        int qtdtotal = 5;
        int qtd10 = 0, sidade = 0, qtdruins = 0, idadevelha = 0;
        double mediaidade; double percruins;
        String idvelha = "";
        for(int i = 0; i < qtdtotal; i++){
            System.out.println("Digite a idade: ");
            int idade = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Digite o id: ");
            String id = entrada.nextLine();
            System.out.println("Digite a nota: ");
            int nota = entrada.nextInt();
            if(nota == 10) qtd10++;
            else if(nota <= 5) qtdruins++;
            sidade += idade;
            if(idade > idadevelha){
                idadevelha = idade;
                idvelha = id;
            }
        }
        mediaidade = (double)sidade/qtdtotal;
        percruins = (double)qtdruins*100.0/qtdtotal;
        System.out.println(qtd10 + "\n" + mediaidade + "\n" + percruins + "\n" + idvelha);
    }

    public static void ex7(Scanner entrada){
        int qtd3a = 0, qtdlivros4a = 0, qtdnred = 0;
        while(true){
            System.out.print("Digite a serie: ");
            int serie = entrada.nextInt();
            if(serie == 0) break;
            System.out.print("Digite o n de livros: ");
            int livros = entrada.nextInt();
            System.out.print("Gosta de redação (1) ou não gosta (0)? ");
            int red = entrada.nextInt();
            if(serie == 3){
                qtd3a++;
                if(red == 0) qtdnred++;
            }
            else if(serie == 4 && livros > qtdlivros4a) qtdlivros4a = livros;
        }
        System.out.println(qtd3a + "\n" + qtdlivros4a + "\n" + ((float)qtdnred * 100.0 / qtd3a));
    }

    public static void ex8(Scanner entrada){
        LinkedList<Produto> lista = new LinkedList<Produto>();
        while(true){
            System.out.print("Digite o id: ");
            int id = entrada.nextInt();
            if(id == 0) break;
            System.out.print("Digite o valor: ");
            double valor = entrada.nextDouble();
            System.out.print("Digite o percentual de aumento: ");
            double percentual = entrada.nextDouble();
            Produto prod = new Produto(id, valor, percentual);
            lista.add(prod);
        }
        int qtd100 = 0, qtd0 = 0;
        double s0 = 0, valoralto = 0;
        for(Produto prod : lista){
            double valoratual = prod.getNovoValor();
            System.out.println("Produto " + prod.id + ": " + valoratual);
            if(valoratual >= 100.0 && prod.percentual >= 5) qtd100++;
            if(prod.percentual == 0){
                qtd0++;
                s0 += prod.valor;
            }
            if(valoratual > valoralto) valoralto = valoratual;
        }
        System.out.println(qtd100 + "\n" + s0/qtd0 + "\n" + valoralto);
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        if(args.length != 0){
            switch(args[0]){
                case "1":
                    ex1();
                    break;
                case "2":
                    ex2(entrada);
                    break;
                case "3":
                    ex3(entrada);
                    break;
                case "4":
                    ex4(entrada);
                    break;
                case "5":
                    ex5(entrada);
                    break;
                case "6":
                    ex6(entrada);
                    break;
                case "7":
                    ex7(entrada);
                    break;
                case "8":
                    ex8(entrada);
                    break;
                default:
                    System.out.println("Puts...");
                    break;
            }
        }
        else System.out.println("Puts...");
    }
}
