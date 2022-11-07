package java_poo_exercises;

import java_poo_exercises.model.PessoaFisica;
import java_poo_exercises.model.PessoaJuridica;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaFisica c1 = new PessoaFisica("Jhon Snow", 20, "jhon.snow@gmail.com", "Masc", 20000.0f, "12345678900");
		
		PessoaJuridica c2 = new PessoaJuridica("Mariazinha", 30, "mariazinha@uol.com.br", "Fem", 10000.0f, "1231321230000100");
		
		//Cliente c2 = new Cliente("98765432100", 25, "Sansa Stark", "Femin", 50000.0f);
		
		c1.visualizar();
		//c2.visualizar();
		
		c2.visualizar();

	}

}
