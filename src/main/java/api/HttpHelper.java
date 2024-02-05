package api;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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

    public static String getResponseByPostString(String urlString, String bodyString) {
        StringBuilder response = new StringBuilder();
        BufferedReader br;
        DataOutputStream wr;
        byte[] postData = bodyString.getBytes();
        int postDataLength = postData.length;
        try {
            URL url = new URL(urlString);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setReadTimeout(60_000);
            con.setRequestProperty("Content-type", "application/json; charset=utf-8");
            con.setRequestProperty("Accept", "application/json");

            con.setRequestProperty("Content-Length", Integer.toString(postDataLength));
            con.setDoOutput(true);
            con.setUseCaches(false);

            wr = new DataOutputStream(con.getOutputStream());
            wr.write(postData);

            br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8));
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
        } catch (Exception ex) {

        }
        return response.toString();
    }

    public/* static*/ void maian(String[] args) {
//        String response =
//                getResponseByPostString(
//                        "http://10.10.17.20:9192/messages/SendSyncMessage",
//                        "{\n" +
//                                "  \"id\": -827964354,\n" +
//                                "  \"method\": \"SendNewMessages\",\n" +
//                                "  \"data\": {\n" +
//                                "    \"groupId\": \"5165021051\",\n" +
//                                "    \"text\": \"<strong>Hermes</strong>\\n<i>Время:\\t </i>28.10.2022 14:58:02\\n<strong><i>Баланс депозита в KZT \uD83C\uDDF0\uD83C\uDDFF </i></strong>\\n\\t Balance: \\t-1,048.1100\\n\\t Overbalance: \\t5,000.0000\\n<strong><i>Баланс депозита в USD \uD83C\uDDFA\uD83C\uDDF8 </i></strong>\\n\\t Balance: \\t-7.4969\\n\\t Overbalance: \\t20.0000\\n<strong><i>Баланс депозита в RUB \uD83C\uDDF7\uD83C\uDDFA </i></strong>\\n\\t Balance: \\t-15.5250\\n\\t Overbalance: \\t1,000.0000\\n\"\n" +
//                                "  }\n" +
//                                "}");
//        System.out.println(response);

        Map.Entry<Integer, String> integerStringEntry = httpGetRequestWithStatus("https://utas.uz/");
        System.out.println("integerStringEntry = " + integerStringEntry);
    }

//    public static void main(String[] args) {
//        Map.Entry<Integer, String> integerStringEntry = httpGetRequestWithStatus("https://cbu.uz/uz/arkhiv-kursov-valyut/json/RUB/");
//        System.out.println("integerStringEntry.getValue() = " + integerStringEntry.getValue());
//    }

    public static class WorkerThread implements Runnable {
        @Override
        public void run() {
            log.info(Thread.currentThread().getName() + " Start");
            try {
                URL url = new URL("https://eco-service.uz/");

                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");
                con.setReadTimeout(60_000);
                con.setDoOutput(true);
                con.setUseCaches(false);

                log.info((con.getResponseCode() >= 400 ? con.getErrorStream() : con.getInputStream()).toString());
            } catch (IOException ex) {
                log.error(ex.getMessage());
            }

            log.info(Thread.currentThread().getName() + " End");
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        Runnable worker = new WorkerThread();
        for (int i = 0; i < 10000; i++) {
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
            executor.execute(worker);
        }
    }
}
