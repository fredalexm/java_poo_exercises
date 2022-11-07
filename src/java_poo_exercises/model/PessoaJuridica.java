package java_poo_exercises.model;

public class PessoaJuridica extends Cliente{
	
	private String cnpj;

	public PessoaJuridica(String nome, int idade, String email, String sexo, float saldo, String cnpj) {
		super(nome, idade, email, sexo, saldo);
		// TODO Auto-generated constructor stub
		this.cnpj = cnpj;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nCNPJ do cliente: " + this.cnpj);
	}


}
