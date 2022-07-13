package tela;
import model.ApiUtils;
import model.Imdb;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ProcurarNomeFilme {
    public static CompletableFuture<Void> procurarNomeFilme() throws InterruptedException {
        String nomeFilme = GetNomeFilme.getNomeFilme();
        return CompletableFuture.supplyAsync(() -> {
                    try {
                        return ApiUtils.serviceCall("http://www.omdbapi.com/?t=&apikey=c30d8101&t="+nomeFilme, Imdb.class);
                    } catch (ExecutionException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                })
                .thenAccept(c -> System.out.println(c.toString()));
    }
}
