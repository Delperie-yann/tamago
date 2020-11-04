package tamagochiV2;

import java.util.Random;

import outils.Clavier;


public abstract class Tamago2 {
//INITIALIZATION
	// Variable
	Tamago2 myTama;
	
	private String name;

	String colorair[] = {
			
			"bleu","blanc", "gris", "jaune", "marron", "noir", "orange", "rose", "rouge", "vert", "violet" 
			
	};

	private String color = colorair[1];
	private Double age = 1.0;
	private double size = 1;
	private double lifeTime = 50;
	private String mask = "masquer";
	private double hunger = 50;
	private double health = 50;
	private String tint = "Bleu";
	private Double sex = (double) 10;
	private double mood = 50;
	private double social = 50;
	private double cleaning = 50;
	private String variety;
	String textRepeat[] = {
			
"[ Votre Tamago est", "Faut pas abuser non plus....", "\nJe n'ai pas compris...\n" 

};
	String stateList[] = { 
			
			"entrain de sauter de joie,", "malheureux", "propre", "sale", "bien portant", "blessé",
			
			"bien nourri", "affamé", "très sale", "social", "normal", "associal"
			
	};
	String nature[] = { 
			
			"un tamago", "Chat", "Dragon", "Chien" 
			
	};
	
	// Initalise Tamago
	public Tamago2() {

	}

	// Creates a Tamago with its own parameters
	public Tamago2(String name, String color, String variety, double age, int size, double lifeTime, String mask,
			int hunger, int health, String tint, int sex, int mood, int social, int cleaning) {

		this.name = name;
		this.color = color;
		this.variety = variety;
		this.age = age;
		this.size = size;
		this.lifeTime = lifeTime;
		this.mask = mask;
		this.hunger = bornC(hunger);
		this.health = bornC(health);
		this.tint = tint;
		this.sex = (double) sex;
		this.mood = bornC(mood);
		this.social = bornC(social);
		this.cleaning = bornC(cleaning);
	}

//MENU
	// Creates a menu to change the initial settings of the Tamago
	public void menu() {
		System.out.println("Voulez vous crée votre personnage? \n'oui' ou 'non'");
		String n = Clavier.lireString();
		if (n.equals("oui")) {
			System.out.println("Vous voulez changer un parametre?");
			change();
		} else if (n.equals("non")) {
			interaction();
		} else {

			System.out.println("\nJe n'ai pas compris...\n");
			menu();
		}
	}

	// Creates a menu to modify all the parameters (name,color,health,mask,type)
	public void change() {
		show();
		System.out.println("\n----------------------------------\n" + "Menu des paramêtres Tamago\n"
				+ "----------------------------------\n");
		System.out.println("(1) Changer le nom?");
		System.out.println("(2) Changer la couleur?");
		System.out.println("(3) Changer sa santer?");
		System.out.println("(4) Un Masque?");
		System.out.println("(5) Le type du Tamago?");
		System.out.println("(6) Fin des changements de style? (Plus de modification possible...)");
		int n = Clavier.lireInt();

		switch (n) {
		case 1: {
			// Change the name
			System.out.println("Nom?");
			String name = Clavier.lireString();
			setName(name);

			change();
			break;
		}
		case 2: {
			// Change the color
			System.out.println("Changer la couleur de ton Tamago?\n"
					+ "\"Vous ne pouvez choisir que des couleurs de base en minuscule exemple : marron, vert\n");
			
			setColor();

			change();
			break;
		}
		case 3: {
			// Change the health
			System.out.println("Tu veux partir avec moins de santer? Combien? 'max 100' ");
			int health = Clavier.lireInt();
			setHealth(health);

			change();
			break;
		}

		case 4: {
			// Change the mask
			System.out.println("Tu veux un masque? 'oui' ou 'non' ");
			String mask = Clavier.lireString();
			if (mask.equals("oui")) {
				setHealth(health * 2);
			} else if (mask.equals("non")) {
				setMask("non masquer");
				setHealth(health / 2);

				change();
			} else {
				System.out.println(textRepeat[2]);

				change();
			}

			break;
		}
		case 5: {
			// Change the type
			System.out.println("Tu voudrais être?\n	()'" + nature[0 + 1] + "'\n	()'" + nature[0 + 2] + "'\n	()'"
					+ nature[0 + 3] + "'\n" + "	()'Retour'");
			String nature = Clavier.lireString();
			typeChoice(typeNature(nature));
			break;
		}
		case 6: {
			interaction();
			break;
		}

		default: {
			change();
			System.out.println(textRepeat[2]);

			break;
		}
		}
	}

//TYPE
	// Choose the type of tamago and return a number
	public int typeNature(String variety) {
		int varietyInt = 0;
		if (variety.equals(nature[1])) {
			System.out.println(nature[1] + "\n");
			varietyInt = 1;
		}
		if (variety.equals("Dragon")) {
			System.out.println("Tu as choisi" + nature[2] + "\n");
			varietyInt = 2;
		}
		if (variety.equals("Chien")) {
			System.out.println("Tu as choisi " + nature[3] + "\n");
			varietyInt = 3;
		}
		if (variety.equals("Retour")) {
			varietyInt = 4;
		}
		return varietyInt;
	}

	// Uses the number of the type and modifies its characteristics
	public void typeChoice(int varietyInt) {
		switch (varietyInt) {
		// Simple Tamago
		case 1: {
			setName("Garfield");
			setVariety("Chat");
			setLifeTime(15);
			setSize(1);
			setMood(80.0);
			setCleaning(80.0);
			show();
			change();
			break;
		}
		case 2: {
			// Dragon Tamago
			setVariety("Dragon");
			setName("Smoog");
			setLifeTime(90);
			setSize(100);
			setMood(20.0);
			setCleaning(20.0);
			show();
			change();
			break;
		}
		case 3: {
			// Dog Tamago
			setName("Scobydou");
			setVariety("Chien");
			setLifeTime(15);
			setMood(80.0);
			setCleaning(20.0);
			setSocial(20.0);
			change();

			break;
		}
		case 4: {
			// Back to change Attribut
			change();
			break;
		}
		default: {
			System.out.println(textRepeat[2]);
			change();
			break;
		}
		}
	}

	// Returns all the states of Tamago
	public void state() {

		System.out.println("\n--------------------------------------------");
		System.out.println("Nom : " + this.name);
		System.out.println("Couleur : " + this.color);
		System.out.println("Type : " + this.variety);
		System.out.println("Teinte des cheveux : " + this.tint);
		System.out.println("Age : " + this.age);
		System.out.println("Taille : " + this.size);
		System.out.println("Durée de vie restante : " + this.lifeTime);
		System.out.println("Mask : " + this.mask);
		System.out.println("Estomac : " + this.hunger);
		System.out.println("Santer : " + this.health);
		System.out.println("Humeur :" + this.mood);
		System.out.println("Social :" + this.social);
		System.out.println("Puissance sexuel : " + this.sex);
		System.out.println("Propeté : " + this.cleaning + "\n------------------------------");
		interaction();
	}

	// Controls the states (lifeTime, propete ect...) before returning an action
	// menu.
	public void interaction() {
		stateFeeling();
		durt();
		dead();
		System.out.println("------------------------------------------------------"
				+ "\nQue voulez vous faire faire à votre Tamago?\n"
				+ "------------------------------------------------------\n");
		System.out.println("(1) ETAT");
		System.out.println("(2) Le Nourir?");
		System.out.println("(3) Le Laver?");
		System.out.println("(4) Le Soigner?");
		System.out.println("(5) Lui faire rencontrer des ami(e)s?");
		System.out.println("(6) Qu'il se repose?");
		System.out.println("(7) Lui faire faire du Sport?");
		System.out.println("(8) Le tuer?");
		System.out.println("(9) Lui teindre les poils?");
		System.out.println("(10) Qu'il se detende?");
		int n = Clavier.lireInt();
		switch (n) {
		case 1: {
			state();
		}
		case 2: {
			// Ask for the quantity of food 1 or 2 and use the value
			System.out.println("---------------------\nNourrir\n (1)-Un peu ou (2)-Beaucoup?\n---------------------");
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

			interaction();
			break;
		}
		case 3: {
			// Use value 1 or 2 to launch hand or shower
			System.out.println("---------------------\n(1)-les mains ou (2)-la douche?\n---------------------");
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

			interaction();
			break;
		}
		case 4: {
			// Use value 1 or 2 to start kit or hospital
			System.out.println("---------------------\n(1)-Trouse ou (2)-Hopital?\n---------------------");
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

			interaction();
			break;
		}
		case 5: {
			// Use value 1 or 2 to start bestFriend or party
			System.out.println("---------------------\n(1)-Meilleur amis ou (2)-Soirée?\n---------------------");
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

			interaction();
			break;
		}
		case 6: {
			// Use value 1 or 2 to start nap or night
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

			interaction();
			break;

		}
		case 7: {
			// Ask for the 'times', 1 or 2 of sport and use the value
			System.out.println("---------------------\ncombien d'heures? (1) ou (2)");
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

			interaction();
			break;
		}
		case 8: {
			// KILL with approval
			System.out.println("Tu es sur? 'oui' ou 'non'");
			String n1 = Clavier.lireString();
			if (n1.equals("oui")) {
				change();
				System.out.println("\nASSASSIN VOUS AVEZ TUER VOTRE TAMAGO!!!");
			} else {
				interaction();
			}

		}

			break;
		case 9: {
			// Change the tint
			
		
			System.out.println("Qu'elle est la couleur pour ses cheveux?\n"
					+ "Vous ne pouvez choisir que des couleurs de base en minuscule exemple : marron, vert");
			String n1 = Clavier.lireString();
		
			for (int a=0 ;a< colorair.length ; a++){ 
						
							colorair[a].equals(n1);
							
						}
							
							 {
							
							{
						this.tint = n1;
					}
							
				} 
			interaction();
			
			break;
		}
		case 10: {
			// Use value 1 or 2 to start relax or smoke
			System.out.println("---------------------\n Quoi?\n(1)-Hamac ou (2)-Fumer\n");
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
				break;
			}
		}
			break;

		default: {
			System.out.println(textRepeat[2]);
			interaction();

		}
		}
	}

// Returns the values of the tamago in a sentence
	public void show() {
		System.out.println("Votre tamago s'appel " + name + ", c'est un " + variety + ", il est de couleur " + color
				+ ", son age est de " + age + " ans, il peux encore vivre jusqu'à " + lifeTime + " années.\nIl est "
				+ mask);
	}

//ACTION
	// Applies growth and aging and modifies action parameters
	public void food(int quant) {
		growth();
		aging();
		setHunger(bornC(getHunger() + (7 * quant * rand())));
		setCleaning(bornC(getCleaning() - (2 * quant)));
		setMood(bornC(getMood() + 2));
		setHealth(bornC(getHealth() - 2));
		setSize(getSize() + 1);
		setSex(bornC(getSex() - 2));

	}

	// Applies growth and modifies action parameters
	public void hand(int quant) {
		aging();
		setCleaning(bornC(getCleaning() + 1));
		setMood(bornC(getMood() + 1));
		setHunger(bornC(getHunger() - 1));
		setSex(bornC(getSex() - 1));

	}

	// Applies growth and modifies action parameters
	public void shower(int quant) {
		aging();
		setCleaning(bornC(getCleaning() + (3 * quant * rand())));
		setMood(bornC(getMood() + 2));
		setHunger(bornC(getHunger() - 1));
		setSex(bornC(getSex() - 1));

	}

	// Applies growth and modifies action parameters
	public void startKit(int quant) {
		aging();
		setHealth(getHealth() + 10);
		setMood(bornC(getMood() - 1));
		setCleaning(bornC(getCleaning() - 1));
		setSex(bornC(getSex() - 1));

	}

	// Applies growth and modifies action parameters
	public void hopital(int quant) {
		aging();
		setHealth(bornC(getHealth() + (10 * rand())));
		setMood(bornC(getMood() - 3));
		setCleaning(bornC(getCleaning() - 3));
		setSex(bornC(getSex() - 2));
		setSocial(bornC(getSocial() - 1));

	}

	// Applies growth and aging and modifies action parameters
	public void nap(int quant) {
		growth();
		aging();
		setHunger(bornC(getHunger() - (2 * quant)));
		setSocial(bornC(getSocial() - quant));
		setSex(bornC(getSex() - (2 * quant)));

	}

	// Applies growth and aging and modifies action parameters
	public void night(int quant) {
		growth();
		aging();
		setHunger(bornC(getHunger() - (7 * quant)));
		setSocial(bornC(getSocial() - (5 * quant)));
		setSex(bornC(getSex() - (3 * quant)));

	}

	// Applies growth and modifies action parameters
	public void sport(int quant) {
		aging();
		setSex(bornC(getSex() + (4 * quant)));
		setHunger(bornC(getHunger() - (3 * quant)));
		setSocial(bornC(getSocial() + (1 * quant)));
		setMood(bornC(getMood() + (1 * quant)));
		setCleaning(bornC(getCleaning() - (4 * quant)));
		setHealth(bornC((getHealth()) + 1));

	}

	// Applies growth and aging and modifies action parameters
	public void bestFriend(int quant) {
		aging();
		sexState();
		setSocial(bornC(getSocial() + (quant * rand())));
		setMood(bornC(getMood() + 2));
		setCleaning(bornC(getCleaning() - 1));
		setHunger(bornC(getHunger() - quant));
		setSex(bornC(getSex() + quant));

	}

	// Applies growth and aging and modifies action parameters
	public void party(int quant) {
		growth();
		aging();
		setSocial(bornC(getSocial() + (5 * quant)));
		setMood(bornC(getMood() + (10 * rand())));
		setCleaning(bornC(getCleaning() - 3));
		setHunger(bornC(getHunger() - (2 * quant)));
		setSex(bornC(getSex() + (5 * quant)));

	}

	// Applies growth and modifies action parameters
	private void relax(int quant) {
		aging();
		setMood(bornC(getMood() + (5 * rand())));

	}

	// Applies growth and modifies action parameters
	private void smoke(int quant) {
		aging();
		setMood(bornC(getMood() + (5 * rand())));
		setHunger(bornC(getHunger() - 1));
		setSex(bornC(getSex() + quant));
		setLifeTime(getLifeTime() - 5);
	}

	// Creates conditions for growth
	public void growth() {
		setSize(bornX(getSize() + (rand() / 8)));
		setMood(bornC(getMood() - (rand() / 2)));
		System.out.println("\n[Le temps à passer : votre " + this.name + " à grandi]");
	}

	// Creates aging conditions and monitors sexual arousal
	public void aging() {
		System.out.println("[Votre " + this.name + " à vielli(e)]\n");
		setLifeTime(getLifeTime() - (rand() / 2));
		setAge(bornC(getAge() + 1));
		setHealth(bornC(getHealth() - 2));
		setHunger(bornC(getHunger() - 3));
		setMood(bornC(getMood() - 2));
		sexState();
	}

	// Consequence of the dirty state
	public void durt() {
		if (this.cleaning < 20) {
			setMood(getMood() - 1);
			setHealth(getHealth() - 1);
			System.out.println();
		}
	}

	// Dead condition
	public void dead() {
		if ((this.lifeTime < 0) || (this.age > 100) || (this.health == 0) || (this.hunger == 0)) {

			System.out.println("\n[" + textRepeat[0] + " mort....]\n\n" + " Durée de vie restante : " + this.lifeTime
					+ "\n Age: " + this.age + "\n Santer  :" + this.health);
			menu();
		}
	}

//STATE AND EMOTION
	// Give general state
	public void stateFeeling() {
		System.out.println("---------------------------------------------\n"
				+ ""+textRepeat[0] + " " + stateMood(mood) + " plutôt " + stateCleaning(cleaning) + " et "
				+ stateHealth(health) + " ]\n");
		System.out.println("[il est " + stateHunger(hunger) + " et il est plutôt " + stateSocial(social) + "]");
	}

	// Gives the mood state
	public String stateMood(double mood) {
		String happy = stateList[0];
		String Bad = stateList[1];
		String moodAct;
		if (this.mood > 50) {
			moodAct = happy;
		} else {
			moodAct = Bad;
		}
		return moodAct;
	}

	// Gives cleanliness state
	public String stateCleaning(double cleaning) {
		String clean = stateList[2];
		String durt = stateList[3];
		String veryDurt = stateList[8];
		String cleaningAct;
		if (this.cleaning > 50) {
			cleaningAct = clean;
		} else if (this.cleaning < 20) {
			cleaningAct = veryDurt;
		} else {
			cleaningAct = durt;
		}
		return cleaningAct;
	}

	// gives Health state
	public String stateHealth(double health) {
		String healthy = stateList[4];
		String hurt = stateList[5];
		String healthAct;
		if (this.health > 50) {
			healthAct = healthy;
		} else {
			healthAct = hurt;
		}
		return healthAct;
	}

	// Give hunger state
	public String stateHunger(double hunger) {
		String Satisfy = stateList[6];
		String starve = stateList[7];
		String hungerAct;
		if (this.hunger > 50) {
			hungerAct = Satisfy;
		} else {
			hungerAct = starve;
		}
		return hungerAct;
	}

	// Give mood state
	public String stateSocial(double social) {
		String popular = stateList[9];
		String normal = stateList[10];
		String misfit = stateList[11];

		String socialAct;
		if (this.social >= 50) {
			socialAct = popular;
		} else if (this.social < 20) {
			socialAct = normal;
		} else {
			socialAct = misfit;
		}
		return socialAct;
	}

//REPRODUCTION

	// If the sexual arousal is above 80 proposes to recreate a Tamago with parent
	// parameters and other random parameters
	// or return to play with old one.
	public void sexState() {

		if (this.getSex() > 80) {
			System.out.println(textRepeat[0] + " prêt à ce reproduire..."
					+ "Voulez vous jouer avec son enfant?\n (1)-Nouveau Tamago' ou '(2)-continuer'");
			int n = Clavier.lireInt();
			switch (n) {
			case 1: {
				name = "Tamago";
				color = getColor();
				age = 1.0;
				size = 1;
				lifeTime = getLifeTime();
				mask = "Masquer";
				hunger = 20 * rand();
				health = 20 * rand();
				tint = "Bleu";
				sex = (double) 10;
				mood = 20 * rand();
				social = 20 * rand();
				cleaning = 20 * rand();
				variety = getVariety();
			}
			case 2: {
				interaction();
			}
			default: {
				System.out.println(textRepeat[2]);
				sexState();
			}
			}

		}
	}

//SET and GET

	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		
	
	
	
		
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor() {
		System.out.println("Rentrer une couleur tout minuscule");
		String n1;
		do {
			 n1 = Clavier.lireString();
		}
		
		
		
		while (!n1.equals(colorair[0])&& !n1.equals(colorair[1]) && !n1.equals(colorair[2]) && !n1.equals(colorair[3]) && !n1.equals(colorair[4]) && !n1.equals(colorair[5]) && !n1.equals(colorair[6]) && !n1.equals(colorair[7]) && !n1.equals(colorair[8]) && !n1.equals(colorair[9]) && !n1.equals(colorair[10]) ); 
			
		 
				this.color = n1;
				
		

			

		
	}

	/**
	 * @return the age
	 */
	public Double getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Double age) {
		this.age = age;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}

	/**
	 * @return the lifeTime
	 */
	public double getLifeTime() {
		return lifeTime;
	}

	/**
	 * @param d the lifeTime to set
	 */
	public void setLifeTime(double d) {
		this.lifeTime = d;
	}

	/**
	 * @return the mask
	 */
	public String getMask() {
		return mask;
	}

	/**
	 * @param mask the mask to set
	 */
	public void setMask(String mask) {
		this.mask = mask;
	}

	/**
	 * @return the faim
	 */
	public double getHunger() {
		return hunger;
	}

	/**
	 * @param faim the faim to set
	 */
	public void setHunger(Double double1) {
		this.hunger = double1;
	}

	/**
	 * @return the santer
	 */
	public double getHealth() {
		return health;
	}

	/**
	 * @param health
	 * 
	 */
	public void setHealth(double health) {
		this.health = health;
	}

	/**
	 * @return the teinte
	 */
	public String getTint() {
		return tint;
	}

	/**
	 * @param teinte the teinte to set
	 */
	public void setTint() {
		System.out.println("Rentrer une couleur tout en minuscule");
		String n1;
		do {
			 n1 = Clavier.lireString();
		}
		
		
		
		while (!n1.equals(colorair[0])&& !n1.equals(colorair[1]) && !n1.equals(colorair[2]) && !n1.equals(colorair[3]) && !n1.equals(colorair[4]) && !n1.equals(colorair[5]) && !n1.equals(colorair[6]) && !n1.equals(colorair[7]) && !n1.equals(colorair[8]) && !n1.equals(colorair[9]) && !n1.equals(colorair[10]) ); 
			
		 
				this.tint = n1;
	
	}
		
	

	/**
	 * @return the sex
	 */
	public Double getSex() {
		return sex;
	}

	/**
	 * @param double1 the sex to set
	 */
	public void setSex(Double double1) {
		this.sex = (double) double1;
	}

	/**
	 * @return the mood
	 */
	public double getMood() {
		return mood;
	}

	/**
	 * @param humeur the modd to set
	 */
	public void setMood(Double double1) {
		this.mood = double1;
	}

	/**
	 * @return the social
	 */
	public double getSocial() {
		return social;
	}

	/**
	 * @param double1 the social to set
	 */
	public void setSocial(Double double1) {
		this.social = double1;
	}

	/**
	 * @return the propete
	 */
	public double getCleaning() {
		return cleaning;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getVariety() {
		return variety;
	}

	/**
	 * @param propete the propete to set
	 */
	public void setCleaning(Double double1) {
		this.cleaning = double1;
	}

// MATH PART
	// Blocks the value entered between 0 and 2 included
	public int nbLim(int pnb) {
		int result = 0;
		if ((pnb > 0) && (pnb <= 2)) {
			result = pnb;
		}
		return result;
	}

	// Creates a random value between 0 and 3 (use in action)
	public double rand() {
		double rand = (double) new Random().nextInt(3) + 1;
		return rand;
	}

	// Blocks the value min to 0
	public static double minValue(double value) {
		if (value > 0) {
			return value;
		} else {
			value = 0;

		}
		return value;
	}

	// Blocks the value max to 100
	public static double bornVerifC(double value) {
		if (value <= 100) {
			return value;
		} else {
			value = 100;

		}
		return value;
	}

	// Blocks the value max to 10
	public static int bornVerifX(int value) {
		if (value <= 10) {

		} else {
			value = 10;

		}
		return value;
	}

	// Verifies that a value is between 0 and 10, thus creating a min and max for a
	// value.
	public static Double bornC(double value) {
		if (value < 0) {
			value = minValue(0);
		} else if (value > 100) {
			value = bornVerifC(100);
		} else {
			value += 0;
		}
		return value;
	}

	// Verifies that a value is between 0 and 100, thus creating a min and max for a
	// value.
	public static int bornX(double value) {
		if (value < 0) {
			value = minValue(0);
		} else if (value > 10) {
			value = bornVerifX(10);
		} else {
			value += 0;
		}
		return (int) value;
	}
}
