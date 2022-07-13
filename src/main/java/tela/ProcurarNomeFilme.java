package tela;
import model.ApiUtils;
import model.Imdb;
import java.util.concurrent.ExecutionException;

public class ProcurarNomeFilme {
    public static void procurarNomeFilme() throws InterruptedException, ExecutionException {
        String nomeFilme = GetNomeFilme.getNomeFilme();
        var filme = ApiUtils.serviceCall("http://www.omdbapi.com/?t=&apikey=c30d8101&t="+nomeFilme, Imdb.class);
        System.out.println(filme.thenAccept(s -> System.out.println(s.toString())));

    }
}
