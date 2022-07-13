import model.ApiUtils;
import model.ImdbSearch;
import model.Search;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;


public class App {
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Selecione a opção desejada:%n1 - Informação completa do filme%n2 - Procurar filmes com o nome em comum");
        String opcao = scanner.next();
        if(opcao.equals("1")){

        }
        else if (opcao.equals("2")) {

        }
        else{
            System.out.println("Opção inválida");
        }
        System.out.println("Qual título do filmes deseja entrar?");
        String nomeFilme = scanner.nextLine().replaceAll("\\s", "+");
        var filme = ApiUtils.serviceCall("http://www.omdbapi.com/?t=&apikey=c30d8101&s="+nomeFilme, ImdbSearch.class);



        filme.getSearch().stream()
                .collect(Collectors.groupingBy(Search::getTitle))
                .forEach((key, value) -> System.out.println(value.get(0).getTitle() + " - " + value.get(0).getYear()));
        System.out.println(filme);
    }

}

