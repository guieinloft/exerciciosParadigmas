import java.util.Scanner;

public class Exercicios{
    public static void ex1(){
        System.out.println(28 * 43);
    }

    public static void ex2(Scanner entrada){
        System.out.println("Digite o primeiro numero: ");
        float a = entrada.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float b = entrada.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        float c = entrada.nextFloat();

        System.out.println((a + b + c)/3);
    }

    public static void ex3(Scanner entrada){
        System.out.println("Digite um numero: ");
        int num = entrada.nextInt();
        System.out.println("Número: " + num + " Predecessor: " + (num-1) + " Sucessor: " + (num+1));
    }

    public static void ex4(Scanner entrada){
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();

        System.out.println("Soma: " + (a + b));
    }

    public static void ex5(Scanner entrada){
        System.out.println("Digite um numero: ");
        int a = entrada.nextInt();

        System.out.println("Terça parte de " + a + ": " + ((float)a/3));
    }

    public static void ex6(Scanner entrada){
        System.out.println("Digite o primeiro numero: ");
        float a = entrada.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float b = entrada.nextFloat();
        System.out.println("Digite o terceiro numero: ");
        float c = entrada.nextFloat();
        System.out.println("Digite o quarto numero: ");
        float d = entrada.nextFloat();

        System.out.println("Média " + (a*1 + b*2 + c*3 + d*4)/10);
    }

    public static void ex7(Scanner entrada){
        System.out.println("Digite o saldo: ");
        double saldo = entrada.nextDouble();
        double reajuste = saldo * 1.01;

        System.out.println("Saldo reajustado: " + reajuste);
    }

    public static void ex8(Scanner entrada){
        System.out.println("Digite a base: ");
        int base = entrada.nextInt();
        System.out.println("Digite a altura: ");
        int altura = entrada.nextInt();

        System.out.println("Perímetro: " + (2*base + 2*altura));
        System.out.println("Área: " + (base * altura));
    }

    public static void ex9(Scanner entrada){
        System.out.println("Digite o raio: ");
        double raio = entrada.nextDouble();

        System.out.println("Perímetro: " + (raio * 6.28));
        System.out.println("Área: " + (raio * raio * 3.14));
    }

    public static void ex10(Scanner entrada){
        System.out.println("Digite a hora: ");
        int hora = entrada.nextInt();

        System.out.println("Já se passaram " + (hora * 60) + " minutos desde a meia noite.");
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
                case "9":
                    ex9(entrada);
                    break;
                case "10":
                    ex10(entrada);
                    break;
                default:
                    System.out.println("Puts...");
                    break;
            }
        }
        else System.out.println("Puts...");
    }
}