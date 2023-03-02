package string;

public class Substring {
    public static void main(String[] args) {
        String path = "{\"kzt_pay_amount\":73.22,\"hermes_commission\":0.002,\"sent_amount\":0.1659}";
        String fileName = path.substring(path.indexOf(":") + 1, path.indexOf(",\"hermes_commission"));
        System.out.println("fileName = " + fileName);
    }
}
