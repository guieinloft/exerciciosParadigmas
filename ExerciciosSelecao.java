import java.util.Scanner;

public class ExerciciosSelecao{
    public static void ex1(Scanner entrada){
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();
        if (a > b) System.out.println((a-b));
        else System.out.println((b-a));
    }

    public static void ex2(Scanner entrada){
        System.out.println("Digite um numero: ");
        int a = entrada.nextInt();
        if (a % 2 == 0) System.out.println("Par");
        else System.out.println("Impar");
        if (a > 0) System.out.println("Positivo");
        else if (a < 0) System.out.println("Negativo");
        else System.out.println("Zero");
    }

    public static void ex3(Scanner entrada){
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();
        if(a == b) System.out.println("Numeros iguais");
        else System.out.println(((a > b) ? a : b) + " e o maior numero");
    }

    public static void ex4(Scanner entrada){
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int c = entrada.nextInt();
        if(a >= 0) System.out.println(Math.pow(a, 0.5));
        else System.out.println(Math.pow(a, 2));
        if(b >= 10 && b <= 100) System.out.println("Número está entre 10 e 100");
        if(c < b) System.out.println((b - c));
        else System.out.println((c + 1));
    }

    public static void ex5(Scanner entrada){
        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();
        if(idade >= 5 && idade <= 7) System.out.println("Infantil A");
        else if(idade >= 8 && idade <= 10) System.out.println("Infantil B");
        else if(idade >= 11 && idade <= 13) System.out.println("Juvenil A");
        else if(idade >= 14 && idade <= 17) System.out.println("Juvenil B");
        else if(idade >= 18) System.out.println("Senior");
        else System.out.println("Idade inválida");
    }

    public static void ex6(Scanner entrada){
        System.out.print("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();
        float media = (nota1+nota2)/2;
        System.out.print("Digite o número de aulas ministradas: ");
        int aulasM = entrada.nextInt();
        System.out.print("Digite o número de aulas assistidas: ");
        int aulasA = entrada.nextInt();
        float freq = aulasA*100/aulasM;
        System.out.println("Média: " + media);
        if(media >= 6 && freq >= 75) System.out.println("Aprovado");
        else if(media < 6) System.out.println("Reprovado por nota");
        else System.out.println("Reprovado por frequência");
    }

    public static void ex7(Scanner entrada){
        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int c = entrada.nextInt();
        boolean tri = ((a < b+c) & (b < a+c) & (c < a+b));
        if(tri){
            if(a == b && a == c) System.out.println("Triângulo equilátero");
            else if(a == b || a == c || b == c) System.out.println("Triângulo isósceles");
            else System.out.println("Triângulo escaleno");
        } else System.out.println("Não é triângulo");
    }

    public static void ex8(Scanner entrada){
        System.out.println("Digite o nível de poluição: ");
        double nivel = entrada.nextDouble();
        if(nivel >= 0.5) System.out.println("TODO MUNDO SE FODE");
        else if(nivel >= 0.4) System.out.println("1o e 2o grupos FORA");
        else if(nivel >= 0.3) System.out.println("1o grupo FORA");
        else System.out.println("Tá de boa");
    }

    public static void ex9(Scanner entrada){
        System.out.println("Digite o saldo: ");
        double saldo = entrada.nextDouble();
        System.out.print("Crédito: ");
        if(saldo <= 200) System.out.println(0);
        else if(saldo <= 400) System.out.println(saldo * 0.2);
        else if(saldo <= 600) System.out.println(saldo * 0.3);
        else System.out.println(saldo * 0.4);
    }

    public static void ex10(Scanner entrada){
        System.out.print("Digite o código: ");
        int codigo = entrada.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        int qtd = entrada.nextInt();
        switch(codigo){
            case 1001:
                System.out.println(qtd * 5.32);
                break;
            case 1324:
                System.out.println(qtd * 6.45);
                break;
            case 6548:
                System.out.println(qtd * 2.37);
                break;
            case 987:
                System.out.println(qtd * 5.32);
                break;
            case 7623:
                System.out.println(qtd * 6.45);
                break;
            default:
                System.out.println("Produto inválido");
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        if(args.length != 0){
            switch(args[0]){
                case "1":
                    ex1(entrada);
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
