import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class ex2{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int voto;
        Collection<Integer> votos = new ArrayList<>();
        while(true){
            System.out.print("Digite seu voto: ");
            voto = s.nextInt();
            if(voto == 0) break;
            votos.add(Integer.valueOf(voto));
        }
        Collection<Integer> opcoes = Arrays.asList(1, 2, 3, 4);

        opcoes.forEach(n -> {
            System.out.println("Votos para o candidato " + n + ": " +
                    votos.stream().filter(v -> v == n).count());
        });
        System.out.println("Votos nulos: " +
                votos.stream().filter(v -> v == 5).count());
        
        System.out.println("Votos em branco: " +
                votos.stream().filter(v -> v == 6).count());
    }
}
