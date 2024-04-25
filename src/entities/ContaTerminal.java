package entities;

public class ContaTerminal {

    private Integer numberAgency;
    private String agency;
    private String clientName;
    private Double balance;

    public ContaTerminal() {
    }

    public ContaTerminal(Integer numberAgency, String agency, String clientName, Double balance) {
        this.numberAgency = numberAgency;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public Integer getNumberAgency() {
        return numberAgency;
    }

    public void setNumberAgency(Integer numberAgency) {
        this.numberAgency = numberAgency;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia eh %s, conta %d e seu saldo %.2f ja esta disponivel para saque.",
        clientName, agency, numberAgency, balance);
    }

    
}
