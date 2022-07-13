package tela;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        do{
            System.out.printf("Selecione a opção desejada:%n1 - Informação completa do filme%n2 - Procurar filmes com o nome em comum%n3 - Sair%n");
            opcao = scanner.next();
            switch (opcao) {
                case "1":
                    ProcurarNomeFilme.procurarNomeFilme();
                    break;
                case "2":
                    ProcurarNomeEmComumFilme.procurarNomeEmComumFilme();
                    DetalhesFilmes.detalhesFilmes();
                    break;
                case "3":
                    System.exit(1);
            }
        }while(true);
    }

}

