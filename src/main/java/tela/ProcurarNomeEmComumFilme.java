package tela;
import model.ApiUtils;
import model.ImdbSearch;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ProcurarNomeEmComumFilme {

    public static CompletableFuture<Void> procurarNomeEmComumFilme(){
        String nomeFilme = GetNomeFilme.getNomeFilme();
        return CompletableFuture.supplyAsync(() -> {
                    try {
                        return ApiUtils.serviceCall("http://www.omdbapi.com/?t=&apikey=c30d8101&s="+nomeFilme, ImdbSearch.class);
                    } catch (ExecutionException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                })
                .thenAccept(c -> c.getSearch().forEach((value) -> System.out.println(value.getTitle() + " - " + value.getYear())));

    }
}
