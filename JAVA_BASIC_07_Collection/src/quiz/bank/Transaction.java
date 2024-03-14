package quiz.bank;

import lombok.Data;

@Data
public class Transaction {
	
	private String transactionDateTime;
	private String kind;
	private long amount;
	private long balance;
	
	public Transaction(String transactionDateTime, String kind, long amount, long balance) {
		this.transactionDateTime = transactionDateTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	
	
}
