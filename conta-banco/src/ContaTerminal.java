import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, informe seu nome completo.");
		String cliente = entrada.next();
		
		System.out.println("Por favor, informe o número da conta.");
		double conta = entrada.nextDouble();
		
		System.out.println("Por favor, informe o número da agência.");
		String agencia = entrada.next();
		
		System.out.println("Por favor, informe o saldo.");
		double saldo = entrada.nextDouble();
		
		System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco. Sua agencia é " + agencia + ", conta " + conta + ", e seu saldo R$" + saldo + " já está disponível para saque.");
		
		
		entrada.close();
		
	}
}
