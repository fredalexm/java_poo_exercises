package java_poo_exercises.model;

public class Console extends Game {
	
	private String fabricante;

	public Console(String nome, String tipo, int classificacao, String plataforma, float valor, String fabricante) {
		super(nome, tipo, classificacao, plataforma, valor);
		// TODO Auto-generated constructor stub
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nFabricante: " + this.fabricante);
	}

}
