package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ClickhouseCsvExport {
    public static void main(String[] args) {
        String url = "jdbc:clickhouse://192.168.201.110:8123/default";
        String user = "default";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Execute SQL query to export data to CSV
            String sql = "SELECT * FROM transfer INTO OUTFILE 'C:/Users/d.axmedov/Desktop/My Projects/Resulfile.csv' FORMAT CSV";
            stmt.executeQuery(sql);

            // Send the CSV file to telegram
//            sendToTelegram();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//    private static void sendToTelegram() {
//        // Create a telegram bot and obtain the API token
//        TelegramBot bot = new TelegramBot("YOUR_API_TOKEN");
//
//        // Set the chat ID of the telegram channel where you want to send the file
//        Long chatId = -103248293421L;
//
//        // Load the CSV file
//        File file = new File("file.csv");
//
//        // Send the CSV file to telegram
//        try {
//            SendDocument sendDocument = new SendDocument(chatId, InputFile.from(file));
//            SendResponse response = bot.execute(sendDocument);
//            System.out.println(response);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }
}
