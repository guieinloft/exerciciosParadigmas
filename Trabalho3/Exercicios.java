public class Exercicios{
    public static void main(String args[]){
        if(args.length == 0){
            System.out.println("Necessário digitar o número do exercício como argumento.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        switch(n){
            case 1 -> Ex1.ex1();
            case 2 -> Ex2.ex2();
            case 3 -> Ex3.ex3();
            case 4 -> Ex4.ex4();
            case 5 -> Ex5.ex5();
            default -> System.out.println("Argumento errado.");
        }
    }
}
