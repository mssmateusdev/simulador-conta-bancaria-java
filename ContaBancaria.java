package projeto;

public class ContaBancaria {
	// Atributos da conta. Só podem ser acessados através do métodos da classe
	private String numeroConta;
	private String nomeTitular;
	private double saldo;
	
	// Construtor é executado quando um novo objeto ContaBancaria é criado
	// Usado para iniciar os dados essenciais
	public ContaBancaria(String numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = 0.0;
		
	}
	// ---- Métodos ----
	
	/*
	 * Adiciona algum valor ao saldo da conta
	 * o valor deve ser acima de 0
	 */
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Erro: O valor do depósito tem que ser acima de R$ 0,00.");
		}
	}
	/*
	 * Retira um valor do saldo da conta, se houver saldo suficiente.
	 * para se o valor for menor ou igual que 0. O valor tem que ser positivo
	 */
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Erro: O valor do saque deve ser positivo.");
		} else if (saldo >= valor){
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso");
		} else {
			System.out.println("Erro: Saldo insuficiente para o saque");
		}
	}
	
	// Retorna o saldo atual da conta
	public double getSaldo(){
		return saldo;
	}
	
	// Retorna o nome do titular da conta
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	// Retorna o número da conta
	public String getNumeroConta() {
		return numeroConta;
	}
	
	
	
	
}
