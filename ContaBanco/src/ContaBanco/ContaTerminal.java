package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
 public static void main(String[] args) {
	
	 //Chamada do método scanner
	 Scanner scanner = new Scanner(System.in);
	 
	 //Entrada de dados
	 System.out.println("Por favor, Digite seu nome: ");
	 String nomeCliente = scanner.nextLine();
	 
	 System.out.println("Digite o nome da agência: ");
	 String agencia = scanner.nextLine();
	 
	 
	 System.out.println("Digite o número da agência: ");
	 int numero = scanner.nextInt();
	 
	 System.out.println("Digite seu saldo: ");
	 double saldo = scanner.nextDouble();
	 
	 //Saída de dados
	 System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque" );
	 
}
}
