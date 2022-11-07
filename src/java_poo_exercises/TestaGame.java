package java_poo_exercises;

import java_poo_exercises.model.Console;
import java_poo_exercises.model.Game;
import java_poo_exercises.model.Jogo;

public class TestaGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Game g1 = new Game("Fifa 22", "Esporte", 10, "Multi", 200.0f );
//		
//		Game g2 = new Game("God of War", "Ação/Aventura", 18, "PS5/PS4", 300.0f );
//		
//
//		g1.visualizar();
//		
//		g2.visualizar();
		
		
		Jogo j1 = new Jogo("Fifa 22", "Esporte", 10, "Multi", 200.0f, "EA Sports");
		
		Jogo j2 = new Jogo("Cod MWII", "FPS", 18, "PS5/Xbox/Win", 300.0f, "Activision");
		
		j1.visualizar();
		
		j2.visualizar();
		
		
		Console c1 = new Console("Halo", "Ação/Terceira pessoa", 18, "Xbox", 100.0f, "Microsoft");
		
		Console c2 = new Console("God of War", "Ação/Aventura", 18, "PS5/PS4", 300.0f, "Sony");
		
		c1.visualizar();
		
		c2.visualizar();
		
		
	}

}
