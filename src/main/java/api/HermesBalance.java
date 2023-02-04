package api;

/**
 * @author Dilshodbek Akhmedov, Dush 09:48. 17/10/22
 */
public class HermesBalance {
    private double Balance;
    private double Overbalance;
    private String Currency;

    public HermesBalance() {
    }

    public HermesBalance(double balance, double overbalance, String currency) {
        Balance = balance;
        Overbalance = overbalance;
        Currency = currency;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getOverbalance() {
        return Overbalance;
    }

    public void setOverbalance(double overbalance) {
        Overbalance = overbalance;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    @Override
    public String toString() {
        return "HermesBalance{" +
                "Balance=" + Balance +
                ", Overbalance=" + Overbalance +
                ", Currency='" + Currency + '\'' +
                '}';
    }
}
