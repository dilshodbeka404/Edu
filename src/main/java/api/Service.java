package api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @author Dilshodbek Akhmedov, Tue 11:15. 26/07/22
 */
public class Service {

    public static String callSOAPServiceResponse(String soapRequest, String url) {
        System.out.println(soapRequest);
        int responseCode;
        BufferedReader br = null;
        String jsonValue = null;
        DataOutputStream wr = null;
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // change these values as per soapui request on top left of request, click on RAW, you will find all the headers
            con.setRequestMethod("POST");
            con.setConnectTimeout(30000);
            con.setReadTimeout(60000);
            con.setRequestProperty("Content-Type", "text/xml");
            con.setDoOutput(true);

            wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(soapRequest);
            wr.flush();
            wr.close();
            responseCode = con.getResponseCode();
            System.out.println("HTTP RESPONSE CODE: " + responseCode);
            br = new BufferedReader(
                    new InputStreamReader(responseCode >= 400 ? con.getErrorStream() : con.getInputStream(), StandardCharsets.UTF_8));

            String responseLine;
            StringBuilder response = new StringBuilder();
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine);
            }
            br.close();

            // You can play with response which is available as string now:
            jsonValue = response.toString();

            // or you can parse/substring the required tag from response as below based your response code
            if (jsonValue.contains("<output>"))
                jsonValue = jsonValue.substring(jsonValue.indexOf("<output>") + 8, jsonValue.indexOf("</output>"));


        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (wr != null) {
                    wr.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return jsonValue;
    }


}

