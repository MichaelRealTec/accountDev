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
	
	@Override // Se apagar o @Override não aprsenta erro mas se estiver o @override o copilador vai procurar na Super-Classe e avisar se houver erro
	public void withdraw(double amount) {
		balance -= amount;
	}
}
