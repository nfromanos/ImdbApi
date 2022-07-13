package tela;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Selecione a opção desejada:%n1 - Informação completa do filme%n2 - Procurar filmes com o nome em comum%n3 - Sair%n");
        String opcao = scanner.next();
        switch (opcao) {
            case "1":
                ProcurarNomeFilme.procurarNomeFilme();
                break;
            case "2":
                ProcurarNomeEmComumFilme.procurarNomeEmComumFilme();
                System.out.printf("Deseja os detalhes de algum filme?%n1 - Sim%n2 - Não");
                String opcao2 = scanner.next();
                if (opcao2.equals("1")) {
                    ProcurarNomeFilme.procurarNomeFilme();
                } else if (opcao2.equals("2")) {
                    App.main(null);
                }
                break;
            case "3":
                System.exit(1);
            default:
                App.main(null);
                break;
        }
    }

}

