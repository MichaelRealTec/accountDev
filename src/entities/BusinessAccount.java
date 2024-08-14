package entities;

public class BusinessAccount extends Account { // extends account (tenho todos os atributos e comporamentos da classe Account
	
	// Atributos
	private Double loanLimit;
	
	// Método Getter e Setter
	
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	
	// Método Construtor
	public BusinessAccount() {
		super(); // Chamar o super para resguardar no futuro para usar a Herança
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // Chamar o construtor da 'Super' Classe = usar o recurso Herança
		this.loanLimit = loanLimit;
	}
	// Método
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}		
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
