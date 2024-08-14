package entities;

public class Account {
	// Atributos
	private Integer number;
	private String holder;
	protected Double balance; // private só pode ser acessado pela classe account.
	// protected pode ser acessado pela subClasse e pela Classe Account.
	// Método Getter e Setter
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getHolder() {
		return holder;
	}
	/* Não posso mudar o saldo da conta livremente!
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	*/
	public Double getBalance() {
		return balance;
	}
	
	// Método Construtor
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	// Método
	public void withdraw(double amount) { // Operação de saque
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}
