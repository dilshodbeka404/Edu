package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONObject;
import org.json.XML;

public class XmlToJson {
    public static void main(String[] args) throws JsonProcessingException {

        // XML data to be converted to JSON
        String xmlData = "<college>\n" +
                "  <student>\n" +
                "    <id>101</id>\n" +
                "    <name>abc</name>\n" +
                "    <branch>CS</branch>\n" +
                "  </student>\n" +
                "  <student>\n" +
                "    <id>102</id>\n" +
                "    <name>xyz</name>\n" +
                "    <branch>IT</branch>\n" +
                "  </student>\n" +
                "</college>";


        JSONObject json = XML.toJSONObject(xmlData);
        System.out.println("json = " + json);
    }
}
