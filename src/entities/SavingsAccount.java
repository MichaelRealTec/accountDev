package entities;

public class SavingsAccount extends Account {
	// Atributos
	private Double interestRate; // Taxa de juros
	
	// Método Getter e Setter
	
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	
	// Método Construtor
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	// Método
	public void updateBalance() {
		balance += balance * interestRate;
	}
}
