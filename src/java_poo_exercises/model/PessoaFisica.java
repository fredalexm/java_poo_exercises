package java_poo_exercises.model;

public class PessoaFisica extends Cliente {
	
	private String cpf;

	public PessoaFisica(String nome, int idade, String email, String sexo, float saldo, String cpf) {
		super(nome, idade, email, sexo, saldo);
		// TODO Auto-generated constructor stub
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nCPF do cliente: " + this.cpf);
	}

}
