package tela;
import model.ApiUtils;
import model.ImdbSearch;
import model.Key;

public class ProcurarNomeEmComumFilme {

    public static void procurarNomeEmComumFilme() {
        String nomeFilme = GetNomeFilme.getNomeFilme();
        var filme = ApiUtils.serviceCall("http://www.omdbapi.com/?t=&apikey="+ Key.KEY.getKey()+"&s="+nomeFilme, ImdbSearch.class);
        filme.thenAccept(s -> s.getSearch().forEach((value) -> System.out.println(value.getTitle() + " - " + value.getYear())));


    }
}
