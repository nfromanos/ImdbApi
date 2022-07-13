package tela;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class DetalhesFilmes {
    public static void detalhesFilmes() throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Deseja os detalhes de algum filme?%n1 - Sim%n2 - Não%n");
        String opcao2 = scanner.next();
        if (opcao2.equals("1")) {
            ProcurarNomeFilme.procurarNomeFilme();
        } else if (opcao2.equals("2")) {
            App.main(null);
        }
    }
}
