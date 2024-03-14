package quiz.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BankProgram {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 전체 계좌 목록\t2. 계좌 등록\t3.소유주명으로 계좌 조회\t4.입금\t5.출금\t6.거래내역 조회\t0.종료");
			switch(sc.nextLine()) {
				case "1" :
					List<Account> accounts = bank.getAccounts();
					printAccounts(accounts);
					break;
				
				case "2" :
					System.out.print("계좌 번호 : ");
					String accountno = sc.nextLine();
					System.out.print("계좌 소유주 : ");
					String name = sc.nextLine();
					System.out.print("잔액 : ");
					long balance = Integer.parseInt(sc.nextLine());
					bank.addAccount(accountno, name, balance);	
					break;
				case "3" :
					System.out.print("계좌 소유주 : ");
					name = sc.nextLine();
					printAccounts(bank.findAccount(name));
					break;
				case "4" :
					System.out.print("계좌 번호 : ");
					accountno = sc.nextLine();
					System.out.print("금액 : ");
					long amount = Integer.parseInt(sc.nextLine());
					
					Account account = bank.getAccount(accountno);
					if(account == null) break;
					account.deposit(amount);
					System.out.printf("입금 금액: %d, 잔액 : %d\n", amount, account.getBalance());
					break;
				case "5" :
					System.out.print("계좌 번호 : ");
					accountno = sc.nextLine();
					System.out.print("금액 : ");
					amount = Integer.parseInt(sc.nextLine());
					account = bank.getAccount(accountno);
					if(account == null) break;
					if(account.withdraw(amount))
						System.out.printf("출금 금액: %d, 잔액 : %d\n", amount, account.getBalance());
					break;
				case "6" :
					System.out.print("계좌 번호 : ");
					accountno = sc.nextLine();
					account = bank.getAccount(accountno);
					if(account == null) break;
					List<Transaction> transactions = account.getTransactions();
					printTransactions(transactions);
					break;
				case "0" :
					System.out.println("종료합니다.");
					return;
				default : 
			}
		}
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		for(Transaction transaction : transactions) {
			System.out.printf("[금액 : %d(%s), 잔액 : %d, 시간 : %s]\n", transaction.getAmount(), transaction.getKind(), transaction.getBalance(), transaction.getTransactionDateTime());
		}
	}

	public static void printAccounts(List<Account> accounts) {
		for(Account account : accounts) {
			System.out.printf("[계좌번호 : %s, 소유자명 : %s, 잔액 : %d]\n", account.getAccountNo(), account.getName(), account.getBalance());
		}
	}
}
