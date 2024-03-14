package quiz.bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Account {
	
	private String accountNo;
	private String name;
	private long balance;
	private List<Transaction> transactions;
    private DateTimeFormatter formatter;

	public Account(String accountNo, String name, long balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		this.transactions = new ArrayList<>();
		this.formatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일HH시mm분");
	}

	public void deposit(long amount) {
		this.balance += amount;
        LocalDateTime currentTime = LocalDateTime.now();
		this.transactions.add(new Transaction(currentTime.format(formatter), "입금", amount, balance));
	}
	
	public boolean withdraw(long amount) {
		if(balance < amount) {
			System.out.println("잔액 부족");
			return false;
		}
		balance -= amount;
        LocalDateTime currentTime = LocalDateTime.now();
		this.transactions.add(new Transaction(currentTime.format(formatter), "출금", amount, balance));
		return true;
	}
	
	public long getBalance() {
		return this.balance;
	}
	
	public List<Transaction> getTransactions() {
		return this.transactions;
	}

}
