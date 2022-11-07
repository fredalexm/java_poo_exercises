package java_poo_exercises.model;

public class Gerente extends Funcionario{
	
	private String acesso;

	public Gerente(int matricula, String nome, String departamento, String funcao, float salario, String acesso) {
		super(matricula, nome, departamento, funcao, salario);
		// TODO Auto-generated constructor stub
		this.acesso = acesso;
		
	}

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nNivel de acessos do Gerente: " + this.acesso);
	}

}
