package api;

import java.util.ArrayList;

/**
 * @author Dilshodbek Akhmedov, Dush 09:47. 17/10/22
 */
public class HermesCheckBalanceResponse {

    private Long AgentID;

    private String ResponseType;

    private ArrayList<HermesBalance> Balances;

    public HermesCheckBalanceResponse() {
    }

    public HermesCheckBalanceResponse(Long agentID, String responseType, ArrayList<HermesBalance> balances) {
        AgentID = agentID;
        ResponseType = responseType;
        Balances = balances;
    }

    public Long getAgentID() {
        return AgentID;
    }

    public void setAgentID(Long agentID) {
        AgentID = agentID;
    }

    public String getResponseType() {
        return ResponseType;
    }

    public void setResponseType(String responseType) {
        ResponseType = responseType;
    }

    public ArrayList<HermesBalance> getBalances() {
        return Balances;
    }

    public void setBalances(ArrayList<HermesBalance> balances) {
        Balances = balances;
    }

    @Override
    public String toString() {
        return "HermesCheckBalanceResponse{" +
                "AgentID=" + AgentID +
                ", ResponseType='" + ResponseType + '\'' +
                ", Balances=" + Balances +
                '}';
    }
}
