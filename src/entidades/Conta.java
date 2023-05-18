package entidades;

public class Conta {

	private int numero;
	private String cliente;
	private double saldo;

	@Override
	public String toString() {

		return "Conta: " + numero + " - Cliente: " + cliente + " - Saldo: " + String.format("R$%.2f", saldo);
	}

	public void saca(double valorSaque) {

		if (valorSaque <= this.saldo) {

			this.saldo -= valorSaque;

			System.out.println("O saque foi realizado com sucesso.");

		} else {

			System.out.printf("Desculpe %s, mas você não possui saldo suficiente.\n", this.cliente);
		}
	}

	public String deposita(double valorDeposito) {

		this.saldo += valorDeposito;

		return "O deposito foi realizado com sucesso.";
	}

	public Conta(int numero, String nome, double valorDeposito) {

		this.numero = numero;

		this.cliente = nome;

		this.saldo = valorDeposito;

		System.out.println();
		System.out.println("A conta foi criada.");
	}

	public Conta(int numero, String nome) {

		this.numero = numero;

		this.cliente = nome;

		this.saldo = 0;

		System.out.println();
		System.out.println("A conta foi criada.");
	}

	public String getCliente() {

		return cliente;
	}

	public void setCliente(String cliente) {

		this.cliente = cliente;
	}

	public double getSaldo() {

		return saldo;
	}

	public int getNumero() {

		return numero;
	}

}
