package quiz.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Bank {
	private List<Account> accounts;
	
	public Bank() {
		this.accounts = new ArrayList<>();
	}
	
	public void addAccount(String accountNo, String name, long balance) {
		for(Account account : this.accounts) {
			if(account.getAccountNo().equals(accountNo)) {
				System.out.println("계좌 번호 겹침");
				return;
			}
		}
		this.accounts.add(new Account(accountNo, name, balance)); 
	}
	
	public Account getAccount(String accountNo) {
		for(Account account : this.accounts) {
			if(account.getAccountNo().equals(accountNo)) {
				return account;
			}
		}
		System.out.println("해당 계좌는 존재하지 않음");
		return null;
	}
	
	public List<Account> findAccount(String name) {
		List<Account> myAccounts = new ArrayList<>();
		for(Account account : this.accounts) {
			if(account.getName().equals(name)) {
				myAccounts.add(account);
			}
		}
		return myAccounts;
	}
	
	public List<Account> getAccounts() {
		return this.accounts;
	}
	
	public int getTotalAccount() {
		return accounts.size();
	}
}
