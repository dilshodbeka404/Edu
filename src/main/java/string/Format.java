package string;

/**
 * @author Dilshodbek Akhmedov, Mon 3:13 PM. 2/13/23
 */
public class Format {
    public static void main(String[] args) {
        System.out.println(String.format("%05d", Integer.parseInt("101812300")));

        String url = "bill_id=%s&request_id=%s";
        System.out.println("String.format(url, \"84eqrfwe48\",\"464ew4e\") = " + String.format(url, "84eqrfwe48", "464ew4e"));

    }
}
