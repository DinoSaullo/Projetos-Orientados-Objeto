package aplicacao;

import java.util.Scanner;

import entidades.Cliente;
import entidades.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o número da conta: ");
		int numeroConta = Integer.parseInt(teclado.nextLine());

		System.out.println("Informe o nome do cliente: ");
		String nome = teclado.nextLine();
		System.out.println("Informe o endereço do cliente: ");
		String endereco = teclado.nextLine();
		System.out.println("Informe o telefone do cliente: ");
		String telefone = teclado.nextLine();
		System.out.println("Informe a data de nascimento do cliente: ");
		String dataNascimento = teclado.nextLine();

		Cliente cliente = new Cliente(nome, endereco, telefone, dataNascimento);
		infoCliente(cliente);

		mensagem("Será realizado um depósito inicial? (s/n)");
		char resposta = teclado.next().toLowerCase().charAt(0);

		depositoInicial(numeroConta, cliente, resposta);

		teclado.close();
	}

	private static void depositoInicial(int numeroConta, Cliente cliente, char resposta) {

		Scanner teclado = new Scanner(System.in);

		if (resposta == 's') {

			mensagem("Informe o valor do deposito inicial: ");

			double depositoInicial = teclado.nextDouble();

			Conta conta1 = new Conta(numeroConta, cliente, depositoInicial);

			infoConta(conta1);

//			sacar(conta1, teclado);
//
//			depositar(conta1, teclado);
//
//			infoConta(conta1);

		} else {

			Conta conta1 = new Conta(numeroConta, cliente);

			infoConta(conta1);

//			depositar(conta1, teclado);

//			infoConta(conta1);
//
//			sacar(conta1, teclado);
//
//			infoConta(conta1);
		}

		teclado.close();
	}

	private static void infoConta(Conta conta) {

		mensagem(conta.toString());
		System.out.println();
	}

	private static void infoCliente(Cliente cliente) {

		mensagem(cliente.toString());
		System.out.println();
	}

//	private static void sacar(Conta conta, Scanner teclado) {
//
//		teclado.nextLine();
//
//		System.out.println("Informe o valor a ser sacado: ");
//
//		double valorSaque = teclado.nextDouble();
//
//		conta.saca(valorSaque);
//
//	}

//	private static void depositar(Conta conta, Scanner teclado) {
//
//		teclado.nextLine();
//
//		System.out.println("Informe o valor a ser depositado: ");
//
//		double valorDeposito = teclado.nextDouble();
//
//		System.out.println(conta.deposita(valorDeposito));
//
//	}

	private static void mensagem(String texto) {

		System.out.println(texto);
	}
}
