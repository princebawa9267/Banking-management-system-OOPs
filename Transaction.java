import java.util.Date;

public class Transaction {
    private Double amount;
    private Date date ;
    private TransactionType transactionType;

    public Transaction(Double amount, TransactionType transationType){
        this.amount = amount;
        this.transactionType = transationType;
        this.date = new Date();
    }

    @Override
    public String toString(){
        String type = (transactionType == TransactionType.DEPOSIT) ? "Deposited" : "Withdrawen";
        return "$ " + amount + " " + type  + " at " + date ;
    }
}
