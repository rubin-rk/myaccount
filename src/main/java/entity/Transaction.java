package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trans")
public class Transaction {
    @Id
    private int id;
    private int From_Account;
    private int To_Account;
    private String Description;
    private  int trans_date;
    private int Amount;

    public Transaction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFrom_Account() {
        return From_Account;
    }

    public void setFrom_Account(int from_Account) {
        From_Account = from_Account;
    }

    public int getTo_Account() {
        return To_Account;
    }

    public void setTo_Account(int to_Account) {
        To_Account = to_Account;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getTrans_date() {
        return trans_date;
    }

    public void setTrans_date(int trans_date) {
        this.trans_date = trans_date;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
