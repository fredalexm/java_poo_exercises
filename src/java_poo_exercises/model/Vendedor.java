package java_poo_exercises.model;

public class Vendedor extends Funcionario{
	
	private float comissao;

	public Vendedor(int matricula, String nome, String departamento, String funcao, float salario, float comissao) {
		super(matricula, nome, departamento, funcao, salario);
		// TODO Auto-generated constructor stub
		this.comissao = comissao;
		
		
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nComissão por venda em R$: " + this.comissao);
	}
	

}
