package projeto;
import java.util.Scanner;


/*
 * Classe principal que simula a interação do usuário com a conta bancária 
 * através de um terminal
 */
public class TerminalBanco {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- Bem-vindo ao Banco Digital ---");
		System.out.println("Por favor, digite o nome do titular da conta: ");
		String nome = scanner.nextLine();
		
		// Cria uma novo objeto da nossa classe ContaBancaria
		ContaBancaria minhaConta = new ContaBancaria("001", nome);
		
		System.out.println("\nConta criada com sucesso para: " + minhaConta.getNomeTitular());
		System.out.println("Número da Conta: " + minhaConta.getNumeroConta());
		
		int opcao = 0; // Variável para guardar a escolha do usuário 
		
		// Loop principal do menu, ele continua executando enquanto a opção não for 4
		while (opcao != 4) {
			System.out.println("\n--- MENU ----");
			System.out.println("1. Consultar Saldo");
			System.out.println("2. Depositar");
			System.out.println("3. Sacar");
			System.out.println("4. Sair");
			System.out.println("Escolha uma opção: ");
		
			opcao = scanner.nextInt(); // Vai ler a opção do usuário
			
			switch (opcao) {
				case 1:
					System.out.printf("Saldo atual: R$ %.2f\n", minhaConta.getSaldo());
					break;
				case 2:
					System.out.print("Digite o valor para depósito: ");
					double valorDeposito = scanner.nextDouble();
					minhaConta.depositar(valorDeposito);
					break;
				case 3:
					System.out.print("Digite o valor para saque: ");
					double valorSaque = scanner.nextDouble();
					minhaConta.sacar(valorSaque);
					break;
				case 4:
					System.out.println("Obrigado por utilizar nosso banco. Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
					break;
			}
		}
		
		// Fecha o scanner
		scanner.close();
	}
}
