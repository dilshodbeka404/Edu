package streams;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

public class StreamException {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        list.stream()
            .filter(s -> {
                System.out.println(s);
                return s.contains("8");
            })
            .findFirst()
            .ifPresent(
                s -> {
                    throw new BadRequestException(s, Response.accepted().build());
                }
            );
    }
}
