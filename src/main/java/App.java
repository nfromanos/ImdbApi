import model.ApiUtils;
import model.Imdb;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;


public class App
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual título do filmes deseja entrar?");
        String nomeFilme = scanner.nextLine().replaceAll("\\s", "+");
        var filme = ApiUtils.serviceCall("http://www.omdbapi.com/?t="+nomeFilme+"&apikey=c30d8101", Imdb.class);
        System.out.println(filme);



    }

}

