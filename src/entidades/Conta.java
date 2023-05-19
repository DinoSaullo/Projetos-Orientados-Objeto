package entidades;

public class Conta {

	private int numero;
	private Cliente cliente = new Cliente();
	private double saldo;

	public Conta(int numero, Cliente cliente, double valorDeposito) {

		this.numero = numero;

		this.cliente = cliente;

		this.saldo = valorDeposito;

		this.linhaEmBranco();
		this.mensagem("A conta foi criada.");
	}

	public Conta(int numero, Cliente cliente) {

		this.numero = numero;

		this.cliente = cliente;

		this.saldo = 0;

		this.linhaEmBranco();
		this.mensagem("A conta foi criada.");
	}

	public String getClienteNome() {

		return this.cliente.toString();
	}

	public double getSaldo() {

		return saldo;
	}

	public int getNumero() {

		return numero;
	}

	private void mensagem(String texto) {

		System.out.println(texto);
	}

	private void linhaEmBranco() {

		System.out.println();
	}

	public void saca(double valorSaque) {

		if (valorSaque + 5.0f <= this.saldo) {

			this.saldo -= valorSaque;

			this.mensagem("O saque foi realizado com sucesso.");

		} else {

			this.mensagem(String.format("Desculpe %s, mas você não possui saldo suficiente.", this.cliente));
		}
	}

	public String deposita(double valorDeposito) {

		this.saldo += valorDeposito;

		return "O deposito foi realizado com sucesso.";
	}

	@Override
	public String toString() {

		return "Conta: " + numero + " - Cliente: " + cliente.getNome() + " - Saldo: " + String.format("R$%.2f", saldo);
	}
}
