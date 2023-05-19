package entidades;

public class Cliente {

	private String nome;
	private String endereco;
	private String telefone;
	private String dataNascimento;

	public Cliente() {

	}

	public Cliente(String nome) {

		this.nome = nome;
	}

	public Cliente(String nome, String endereco, String telefone, String dataNascimento) {

		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public String toString() {
		return "Cliente [Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone
				+ ", Data de Nascimento: " + dataNascimento + "]";
	}

}
