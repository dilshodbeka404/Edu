package string;

public class Substring {
    public static void main(String[] args) {
        String path = "{\"kzt_pay_amount\":73.22,\"hermes_commission\":0.002,\"sent_amount\":0.1659}";
        String fileName = path.substring(path.indexOf(":") + 1, path.indexOf(",\"hermes_commission"));
        System.out.println("fileName = " + fileName);

        replace();
    }

    private static void replace() {

        String query = "SELECT mca.referenceId," +
                " mca.referenceName," +
                " mca.publicationDate," +
                " count(*) AS total," +
                " SUM(if(mca.genderName = 'MALE', 1, 0)) AS maleCount," +
                " SUM(if(mca.genderName = 'FEMALE', 1, 0)) AS femaleCount," +
                " SUM(if(mca.genderName = '', 1, 0)) AS unidentifiedCount" +
                " FROM mobile_client_actions mca";

        String countQuery = query.substring(query.indexOf("FROM"));
        System.out.println("countQuery = " + countQuery);
    }
}
