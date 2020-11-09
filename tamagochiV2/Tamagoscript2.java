package tamagochiV2;

import outils.Clavier;

public class Tamagoscript2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(T33.decoration[0]);
		System.out.println(T33.decoration[1]);

		animal();

	}

	public static void animal() {
		
		Tamago2 myTama = null;
		System.out.println(T33.nature[4]);
		int n = Clavier.lireInt();
		switch(n) {
		case 1 :{
			myTama = new Dragon();	
			System.out.println(T33.decoration[2]);
			break;
		}
		case 2 :{
			myTama = new Chien();
			System.out.println(T33.decoration[3]);
			break;
		}
		case 3 : {
			myTama = new Cat2();
			System.out.println(T33.decoration[4]);
		break;	
		}
		default :{
			System.out.println(T33.textRepeat[2]);
			animal();
		}
		}myTama.change();
		
	}
	
}
