package api;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Dilshodbek Akhmedov, Mon 15:07. 19/09/22
 */

public class APIClient {
    HttpClient client;

    public APIClient() {
        client = HttpClient.newHttpClient();
    }

    public HttpResponse<String> call(String url, Map<String, String> params) throws URISyntaxException, IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(url))
                .POST(getParamsUrlEncoded(params))
                .headers("Content-Type", "application/x-www-form-urlencoded")
                .build();
        System.getLogger("").log(System.Logger.Level.INFO, request.toString());
        return client.send(request, HttpResponse.BodyHandlers.ofString());
    }

    public static void main(String[] args) {
        Map<String, String> parametrs = new HashMap<>();
        parametrs.put("username", "paynet");
        parametrs.put("passsword", "PAynet1342");
        parametrs.put("method", "checkStatus");
        parametrs.put("order", "easy");
        String paramsUrlEncoded = getParamsEncoded(parametrs);
        System.out.println("paramsUrlEncoded = " + paramsUrlEncoded);
    }

    private HttpRequest.BodyPublisher getParamsUrlEncoded(Map<String, String> parameters) {
        String urlEncoded = parameters.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&"));
        return HttpRequest.BodyPublishers.ofString(urlEncoded);
    }

    private static String getParamsEncoded(Map<String, String> parameters) {
        return parameters.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&"));
    }
    
}
