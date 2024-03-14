package leetcode;

public class Solution1507 {


    public String reformatDate(String date) {
        String[] data = date.split(" ");
        return String.join("-",
                data[2],
                getMonth(data[1]),
                data[0].length() - 2 > 1
                        ? data[0].substring(0, data[0].length() - 2)
                        : "0" + data[0].substring(0, data[0].length() - 2)
        );
    }

    private String getMonth(String month) {
        return switch (month) {
            case "Jan" -> "01";
            case "Feb" -> "02";
            case "Mar" -> "03";
            case "Apr" -> "04";
            case "May" -> "05";
            case "Jun" -> "06";
            case "Jul" -> "07";
            case "Aug" -> "08";
            case "Sep" -> "09";
            case "Oct" -> "10";
            case "Nov" -> "11";
            case "Dec" -> "12";
            default -> null;
        };
    }
}
