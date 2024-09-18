package streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamNewTest {
    public static void main(String[] args) {
        updateApayCashBack(
                Arrays.asList(
                          new TransactionResponse("agent_commission", "commission_1"),
                          new TransactionResponse("agent_commission2", "commission_2"),
                          new TransactionResponse("agent_commission", "commission_3"),
                          new TransactionResponse("agent_commission4", "commission_4"),
                          new TransactionResponse("agent_commission", "commission_5"),
                          new TransactionResponse("agent_commission", "commission_6"),
                          new TransactionResponse("agent_commission7", "commission_7"),
                          new TransactionResponse("agent_commission", "commission_8")
                )
        );
    }


    public static void updateApayCashBack(List<TransactionResponse> response) {
        Optional
                .ofNullable(response)
                .map(List::stream)
                .orElseGet(Stream::empty)
                .filter(transactionResponse -> "agent_commission".equals(transactionResponse.getKey()))
                .forEach(
                        transactionResponse -> {
                            System.out.println("transactionResponse.getVal() = " + transactionResponse.getVal());
                        }
                );
    }

    @Getter
    @Setter
    @AllArgsConstructor
    static class TransactionResponse {
        private String key;
        private String val;
    }

}
