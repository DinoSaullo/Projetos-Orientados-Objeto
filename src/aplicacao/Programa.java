package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o número da conta: ");

		int numeroConta = teclado.nextInt();

		teclado.nextLine();

		System.out.println("Informe o nome do cliente: ");

		String nome = teclado.nextLine();

		System.out.println("Será realizado um depósito inicial? (s/n)");

		char resposta = teclado.next().toLowerCase().charAt(0);

		if (resposta == 's') {

			System.out.println("Informe o valor do deposito inicial: ");

			double depositoInicial = teclado.nextDouble();

			Conta conta1 = new Conta(numeroConta, nome, depositoInicial);

			infoConta(conta1);

			sacar(conta1, teclado);

			depositar(conta1, teclado);

			infoConta(conta1);

		} else {

			Conta conta1 = new Conta(numeroConta, nome);

			infoConta(conta1);

			depositar(conta1, teclado);

			infoConta(conta1);

			sacar(conta1, teclado);

			infoConta(conta1);
		}

		teclado.close();
	}

	private static void infoConta(Conta conta) {

		System.out.println(conta.toString());
		System.out.println();
	}

	private static void sacar(Conta conta, Scanner teclado) {

		teclado.nextLine();

		System.out.println("Informe o valor a ser sacado: ");

		double valorSaque = teclado.nextDouble();

		conta.saca(valorSaque);

	}

	private static void depositar(Conta conta, Scanner teclado) {

		teclado.nextLine();

		System.out.println("Informe o valor a ser depositado: ");

		double valorDeposito = teclado.nextDouble();

		System.out.println(conta.deposita(valorDeposito));

	}
}
