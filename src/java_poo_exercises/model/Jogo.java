package java_poo_exercises.model;

public class Jogo extends Game{
	
	private String studio ;

	public Jogo(String nome, String tipo, int classificacao, String plataforma, float valor, String studio) {
		super(nome, tipo, classificacao, plataforma, valor);
		// TODO Auto-generated constructor stub
		this.studio = studio;
		
		
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("\nStudio/Produtora: " + this.studio);
	}

}
