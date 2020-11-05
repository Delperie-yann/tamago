package tamagochiV2;

import outils.Clavier;

public class Chien extends Tamago2{

	public Chien() {
		
		setName("Scobydou");
		setVariety("Chien");
		setLifeTime(25);
		setMood(80.0);
		setCleaning(20.0);
		setSocial(20.0);
	}

	/**
	 * @param name
	 * @param color
	 * @param variety
	 * @param age
	 * @param size
	 * @param lifeTime
	 * @param mask
	 * @param hunger
	 * @param health
	 * @param tint
	 * @param sex
	 * @param mood
	 * @param social
	 * @param cleaning
	 */
	public Chien(String name, String color, String variety, double age, int size, double lifeTime, String mask,
			int hunger, int health, String tint, int sex, int mood, int social, int cleaning) {
		super(name, color, variety, age, size, lifeTime, mask, hunger, health, tint, sex, mood, social, cleaning);
		// TODO Auto-generated constructor stub
		
		
		
	}
	// Ask for the quantity of food 1 or 2 and use the value
		public void actionFood() {

			System.out.println("---------------------\nNourrir\n (1)-Croquette ou (2)-Reste de viande?\n---------------------");
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(textRepeat[1] + "\n");
			} else {
				if (n1 == 1) {
					food(nbLim(n1));
				} else {
					food(nbLim(n1));
				}
			}
		}
		public void actionClean() {
			
			System.out.println("---------------------\n(1)-Les pâtes ou (2)-Le poils?\n---------------------");
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(textRepeat[1] + "\n");
			} else {
				if (n1 == 1) {
					hand(nbLim(n1));
				} else {
					shower(nbLim(n1));
				}
			}
		}
		public void actionHealth() {

			System.out.println("---------------------\n(1)-Anti-tique ou (2)-Véterinaire?\n---------------------");
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(textRepeat[1] + "\n");
			} else {
				if (n1 == 1) {
					startKit(nbLim(n1));
				} else {
					hopital(nbLim(n1));
				}

			}
		}
		public void actionSocial() {

			System.out.println("---------------------\n(1)-Le voisin de grillage ou (2)-Balade au parc?\n---------------------");
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(textRepeat[1] + "\n");
			} else {
				if (n1 == 1) {
					bestFriend(nbLim(n1));
				} else {
					party(nbLim(n1));
				}
			}
		}
		// Use value 1 or 2 to start nap or night
		public void actionSlepp() {

			System.out.println("---------------------\n(1)-Sieste ou (2)-Nuit? 1 ou 2\n---------------------");
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(textRepeat[1] + "\n");
			} else {
				if (n1 == 1) {
					nap(nbLim(n1));
				} else {
					night(nbLim(n1));
				}
			}
		}
		// Ask for the 'times', 1 or 2 of sport and use the value
		public void actionSport() {

			System.out.println("---------------------\nJoue à la baballe? (1) ou (2) heures");
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(textRepeat[1] + "\n");
			} else {
				if (n1 == 1) {
					sport(nbLim(n1));
				} else {
					sport(nbLim(n1));
				}

			}
		}
		// Use value 1 or 2 to start relax or smoke
		public void actionRelax() {

			System.out.println("---------------------\n Quoi?\n(1)-Coussin ou (2)-Fumer\n");
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(textRepeat[1] + "\n");
			} else {
				if (n1 == 1) {
					relax(nbLim(n1));
				} else {
					smoke(nbLim(n1));
				}
				interaction();

			}
		}
	}	

