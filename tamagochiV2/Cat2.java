package tamagochiV2;

import outils.Clavier;

public class Cat2 extends Tamago2{

	public Cat2() {
		
		setName("Garfield");
		setVariety("Chat");
		setLifeTime(25);
		setSize(1);
		setMood(80.0);
		setCleaning(80.0);
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
	public Cat2(String name, String color, String variety, double age, int size, double lifeTime, String mask,
			int hunger, int health, String tint, int sex, int mood, int social, int cleaning) {
		super(name, color, variety, age, size, lifeTime, mask, hunger, health, tint, sex, mood, social, cleaning);
		// TODO Auto-generated constructor stub
		
		
		
	}
	// Ask for the quantity of food 1 or 2 and use the value
	public void actionFood() {

		System.out.println(T33.textCat[0]);
		int n1 = Clavier.lireInt();
		if (nbLim(n1) == 0) {
			System.out.println(T33.textRepeat[1] + "\n");
		} else {
			if (n1 == 1) {
				food(nbLim(n1));
			} else {
				food(nbLim(n1));
			}
		}
	}
	// Use value 1 or 2 to launch hand or shower
	public void actionClean() {
		
		System.out.println(T33.textCat[1]);
		int n1 = Clavier.lireInt();
		if (nbLim(n1) == 0) {
			System.out.println(T33.textRepeat[1] + "\n");
		} else {
			if (n1 == 1) {
				hand(nbLim(n1));
			} else {
				shower(nbLim(n1));
			}
		}
	}
	// Use value 1 or 2 to start kit or hospital
	public void actionHealth() {

		System.out.println(T33.textCat[2]);
		int n1 = Clavier.lireInt();
		if (nbLim(n1) == 0) {
			System.out.println(T33.textRepeat[1] + "\n");
		} else {
			if (n1 == 1) {
				startKit(nbLim(n1));
			} else {
				hopital(nbLim(n1));
			}

		}
	}
	// Use value 1 or 2 to start bestFriend or party
	public void actionSocial() {

		System.out.println(T33.textCat[3]);
		int n1 = Clavier.lireInt();
		if (nbLim(n1) == 0) {
			System.out.println(T33.textRepeat[1] + "\n");
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

			System.out.println(T33.textCat[4]);
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(T33.textRepeat[1] + "\n");
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

			System.out.println(T33.textCat[5]);
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(T33.textRepeat[1] + "\n");
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

			System.out.println(T33.textCat[6]);
			int n1 = Clavier.lireInt();
			if (nbLim(n1) == 0) {
				System.out.println(T33.textRepeat[1] + "\n");
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
	

