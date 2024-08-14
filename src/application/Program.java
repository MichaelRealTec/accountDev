package application;
import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
public class Program {

	public static void main(String[] args) {
		// Classes e métodos usando o Final
		// final aplicado a Classe evita que a Classe seja herdada.
		// final aplicado ao método evita o reuso na sub-classe
		// public final class SavingsAccount {  => evita que a Classe SavingsAccount seja herdada ou seja criada sub-classes
		
		
		
		
		Account acc10 = new Account(0001, "Clara", 1000.0);
		acc10.withdraw(200.0);
		System.out.println(acc10.getBalance());
		
		Account acc20 = new SavingsAccount(0002, "Carla", 1000.0, 0.01);
		acc20.withdraw(200.0);
		System.out.println(acc20.getBalance());
		
		Account acc30 = new BusinessAccount(0003, "Jana", 1000.0, 500.0);
		acc30.withdraw(200.0);
		System.out.println(acc30.getBalance());
		
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		// PEGAR UM OBJETO DO TIPO BUSINESSACCOUNT E ATRIBUI-LO PARA UMA VARIAVEL DO TIPO ACCOUNT
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01); // pegar uma sub-classe e atribuir na super-classe
		
		// DOWNCAST
		
		// BusinessAccount acc4 = acc2; // não posso converter de Account para BusinessAccount
		
		BusinessAccount acc4 = (BusinessAccount)acc2; // Posso forçar a conversão mas preciso fazer um (cast)
		acc4.loan(100.0); // agora posso fazer a operação após o DOWNCAST
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;  // Evitar este tipo de erro porque o acc3 não é filho de acc5 BusinesAccount
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	
	}

}
