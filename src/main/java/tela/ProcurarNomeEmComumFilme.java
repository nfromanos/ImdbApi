package tela;
import model.ApiUtils;
import model.ImdbSearch;
import java.util.concurrent.ExecutionException;

public class ProcurarNomeEmComumFilme {

    public static void procurarNomeEmComumFilme() throws ExecutionException, InterruptedException {
        String nomeFilme = GetNomeFilme.getNomeFilme();
        var filme = ApiUtils.serviceCall("http://www.omdbapi.com/?t=&apikey=c30d8101&s="+nomeFilme, ImdbSearch.class);
        filme.thenAccept(s -> s.getSearch().forEach((value) -> System.out.println(value.getTitle() + " - " + value.getYear())));


    }
}
