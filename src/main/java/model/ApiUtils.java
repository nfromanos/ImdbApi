package model;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ApiUtils {
    public static <T>T serviceCall(String url, Class<T> tClass) throws ExecutionException, InterruptedException {
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(URI.create(url)).build();

        CompletableFuture<HttpResponse<String>> response = null;
        response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        //Gson gson = new Gson();
        //return gson.fromJson(response.get().body(), tClass);
        
        // Esse bloco abaixo serviria?
        Gson gson = new Gson();
        String json = mPrefs.getString("MyObject", "");
        MyObject obj = gson.fromJson(json, MyObject.class);

    }
}
