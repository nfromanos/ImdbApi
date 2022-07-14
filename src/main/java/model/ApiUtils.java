package model;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class ApiUtils {
    public static <T> CompletableFuture<T> serviceCall(String url, Class<T> tClass) {
        var client = HttpClient.newHttpClient();

        var request = HttpRequest.newBuilder(URI.create(url)).build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(r ->{
                    Gson gson = new Gson();
                    return gson.fromJson(r.body(), tClass);
                });
    }
}




