package starter.models;

public class TransaccionModels {
    private String transaccionDate;

    public String getTransaccionAmount() {
        return transaccionAmount;
    }

    public void setTransaccionAmount(String transaccionAmount) {
        this.transaccionAmount = transaccionAmount;
    }

    public String getTransaccionDate() {
        return transaccionDate;
    }

    public void setTransaccionDate(String transaccionDate) {
        this.transaccionDate = transaccionDate;
    }

    public String getTransaccionDescription() {
        return transaccionDescription;
    }

    public void setTransaccionDescription(String transaccionDescription) {
        this.transaccionDescription = transaccionDescription;
    }

    private String transaccionAmount;
    private String transaccionDescription;
}
