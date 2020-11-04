package tamagochiV2;

import outils.Clavier;

public class Tamagoscript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("|__   __|                               \r\n"
				+ "    | | __ _ _ __ ___   __ _  __ _  ___  \r\n" + "    | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\ \r\n"
				+ "    | | (_| | | | | | | (_| | (_| | (_) |\r\n" + "    |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \r\n"
				+ "                              __/ |      \r\n" + "                             |___/       \n\n\n");
		System.out.println("Bienvenue dans le Monde de Tamago\n" + "Le monde des petites bêtes vivantes\n"
				+ "Vous partez dans le jeu avec un Tamago \n\n"
				+ "------------------------------------------------------------------");

		animal();

	}

	public static void animal() {
		
		Tamago2 myTama = null;
		System.out.println("Choississez votre type d'animal :\n(1) un Dragon\n(2) un Chien\n(3) un Chat\n");
		int n = Clavier.lireInt();
		switch(n) {
		case 1 :{
			myTama = new Dragon();
		
			
			
			break;
		}
		case 2 :{
			myTama = new Chien();
		
		
			
			break;
		}
		case 3 : {
			myTama = new Cat2();
			
			
		
		break;	
		}
		default :{
			System.out.println("Pas compris recommence...");
			animal();
		}myTama.change();
		}
		
	}
	
}
