package bank.app;

public class Account {

	// 속성
	private String ano;
	private String owner;
	private int balance;
	
	// ano, owner, balance를 매개변수로 속성을 초기화 
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		
	}

	// 속성 ano의 Getter
	public String getAno() {
		return ano;
	}

	// 속성 owner의 Getter
	public String getOwner() {
		return owner;
	}

	// 속성 balance의 Getter
	public int getBalance() {
		return balance;
	}
	
	// 속성 balance의 Setter
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
