package tela;
import model.ApiUtils;
import model.Imdb;
import model.Key;

public class ProcurarNomeFilme {
    public static void procurarNomeFilme(){
        String nomeFilme = GetNomeFilme.getNomeFilme();
        var filme = ApiUtils.serviceCall("http://www.omdbapi.com/?t=&apikey="+Key.KEY.getKey()+"&t="+nomeFilme, Imdb.class);
        filme.thenAccept(s -> System.out.println(s.toString()));

    }
}
