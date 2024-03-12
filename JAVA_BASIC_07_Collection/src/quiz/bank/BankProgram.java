package quiz.bank;

import java.util.ArrayList;
import java.util.List;

class Bank {
	//private Account[] accounts;]
	private List<Account> accounts;
//	private int totalAccount;
	
	public Bank() {
		this.accounts = new ArrayList<>();
//		this.totalAccount = 0;
	}
	
	public void addAccount(String accountNo, String name) {
		this.accounts.add(new Account(accountNo, name)); 
	}
	
	public Account getAccount(String accountNo) {
		return null;
	}
	
	public List<Account> findAccount(String name) {
		return accounts;
	}
	
	public List<Account> getAccounts() {
		return null;
	}
	
	public int getTotalAccount() {
		return 0;
	}
}

class Account {
	
	private String accountNo;
	private String name;
	private long balance;
//	private Transaction[] transactions;
	private List<Transaction> transactions;
	
	public Account(String accountNo2, String name) {
		this.transactions = new ArrayList<>();
		this.accountNo = accountNo2;
		this.name = name;
	}

	public void deposit(long amount) {
	}
	
	public void withdraw(long amount) {
		
	}
	
	public long getBalance() {
		return 0;
	}
	
	public List<Transaction> getTransactions() {
		return null;
	}

}

class Transaction {
	
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
}

public class BankProgram {
	
	public static void main(String[] args) {
		
	}
}
