package java_poo_exercises.model;

public class Cliente {
	
	private String nome;
	private int idade;
	private String email;
	private String sexo;
	private float saldo;
	
	
	public Cliente(String nome, int idade, String email, String sexo, float saldo) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.sexo = sexo;
		this.saldo = saldo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void visualizar() {
		System.out.println("\n****************************************");
		System.out.println("Dados do Cliente");
		System.out.println("\n****************************************");
		System.out.println("\nNome do cliente: " + this.nome);
		System.out.println("\nEmail do cliente: " + this.email);
		System.out.println("\nIdade do cliente: " + this.idade);
		System.out.println("\nQual sexo o cliente se identifica: " + this.sexo);
		System.out.println("\nSaldo da conta: " + this.saldo);
	}
	
	
	

}
