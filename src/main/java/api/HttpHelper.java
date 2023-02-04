package api;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.Map;
import java.util.logging.Level;

/**
 * @author Dilshodbek Akhmedov, Wed 11:37 AM. 1/25/23
 */
@Slf4j
public class HttpHelper {

    public static Map.Entry<Integer, String> httpGetRequestWithStatus(String urlString) {
        int responseCode = -1;
        StringBuilder response = new StringBuilder();
        BufferedReader br = null;
        try {
            URL url = new URL(urlString);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setReadTimeout(60_000);
            con.setDoOutput(true);
            con.setUseCaches(false);

            responseCode = con.getResponseCode();
            br = new BufferedReader(
                    new InputStreamReader(responseCode >= 400 ? con.getErrorStream() : con.getInputStream(), StandardCharsets.UTF_8));
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
        } catch (IOException ex) {
            log.error(ex.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                java.util.logging.Logger.getLogger(HttpHelper.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return new AbstractMap.SimpleImmutableEntry<>(responseCode, response.toString());
    }

    public static void main(String[] args) {
        Map.Entry<Integer, String> integerStringEntry = httpGetRequestWithStatus("https://cbu.uz/uz/arkhiv-kursov-valyut/json/RUB/");
        System.out.println("integerStringEntry.getValue() = " + integerStringEntry.getValue());
    }
}
