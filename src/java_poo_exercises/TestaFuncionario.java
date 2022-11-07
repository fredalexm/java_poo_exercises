package java_poo_exercises;

import java_poo_exercises.model.Funcionario;
import java_poo_exercises.model.Gerente;
import java_poo_exercises.model.Vendedor;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Funcionario f1 = new Funcionario(1234, "Jhon Snow", "TI", "Desenvolvedor",20000.0f);
//		
//		Funcionario f2 = new Funcionario(4321, "Sansa Stark", "RH", "Gerente", 50000.0f);
//		
//		f1.visualizar();
//		f2.visualizar();
		
		Gerente g1 = new Gerente(1234, "Joaozinho", "TI", "Gerente de Projeto", 200000.0f, "Restrito");

		Gerente g2 = new Gerente(1234, "Mariazinha", "RH", "People Manager", 500000.0f, "Contratar/Demitir");

		g1.visualizar();
		
		g2.visualizar();
		
		Vendedor v1 = new Vendedor(1234, "Pedrinho", "Comercial", "Vendedor Assistente", 200000.0f, 1000.0f);

		Vendedor v2 = new Vendedor(1234, "Julinha", "Comercial", "Vendedor Senior", 500000.0f, 2000.0f);

		v1.visualizar();
		
		v2.visualizar();
		
	}

}
