package tamagochiV2;

import java.util.Random;

import outils.Clavier;

public abstract class Tamago2 {
//INITIALIZATION
	// Variable
	Tamago2 myTama;

	private String name;
	private String color = T33.colorair[1];
	private Double age = 1.0;
	private double size = 1;
	private double lifeTime = 50;
	private String mask = "masquer";
	private double hunger = 50;
	private double health = 50;
	private String tint = T33.colorair[0];
	private Double sex = (double) 10;
	private double mood = 50;
	private double social = 50;
	private double cleaning = 50;
	private String variety;
	
	


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
		System.out.println(T33.question[0]);
		String n = Clavier.lireString();
		if (n.equals("oui")) {
			System.out.println(T33.question[1]);
			change();
		} else if (n.equals("non")) {
			interaction();
		} else {
			System.out.println(T33.textRepeat[2]);
			menu();
		}
	}

	
	// Creates a menu to modify all the parameters (name,color,health,mask,type)
	public void change() {
		show();
		T33.menuChange();
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
			System.out.println(T33.question[2]);

			setColor();
			change();
			break;
		}
		case 3: {
			// Change the health
			System.out.println(T33.question[3]);
			int health = Clavier.lireInt();
			setHealth(health);
			change();
			break;
		}

		case 4: {
			
			actionMack();
			break;
		}
		case 5: {
			Tamagoscript2.animal();
			break;
		}
		case 6: {
			interaction();
			break;
		}

		default: {
			change();
			System.out.println(T33.textRepeat[2]);
			break;
		}
		}
	}

	// Returns all the states of Tamago
	public void state() {

		System.out.println(T33.decoration[7]);
		System.out.println("Nom : " + this.name);
		System.out.println("Couleur : " + this.color);
		System.out.println("Type : " + this.variety);
		System.out.println("Teinte des cheveux : " + this.tint);
		System.out.println("Age : " + this.age);
		System.out.println("Taille : " + this.size);
		System.out.println("Durée de vie restante : " + this.lifeTime);
		System.out.println("Mask : " + this.mask);
		System.out.println("Estomac : " + this.hunger);
		System.out.println("Santé : " + this.health);
		System.out.println("Humeur :" + this.mood);
		System.out.println("Social :" + this.social);
		System.out.println("Puissance sexuel : " + this.sex);
		System.out.println("Propeté : " + this.cleaning + T33.decoration[7]);
		interaction();
	}

	

	// Controls the states (lifeTime, propete ect...) before returning an action
	// menu.
	public void interaction() {
		stateFeeling();
		durt();
		dead();
		T33.actionMenu();
		int n = Clavier.lireInt();
		switch (n) {
		case 1: {
			state();
		}
		case 2: {
			actionFood();
			interaction();
			break;
		}
		case 3: {
			actionClean();
			interaction();
			break;
		}
		case 4: {
			actionHealth();
			interaction();
			break;
		}
		case 5: {
			actionSocial();
			interaction();
			break;
		}
		case 6: {
			actionSlepp();
			interaction();
			break;
		}
		case 7: {
			actionSport();
			interaction();
			break;
		}
		case 8: {
			// KILL with approval
			System.out.println(T33.question[5]);
			String n1 = Clavier.lireString();
			if (n1.equals("oui")) {
				System.out.println(T33.question[6]);
				Tamagoscript2.animal();
			} else {
				interaction();
			}
		}
			break;
		case 9: {
			actionTint();
			interaction();
			break;
		}
		case 10: {
			actionRelax();
			interaction();
			break;
		}
		default: {
			System.out.println(T33.textRepeat[2]);
			interaction();
		}
		}
	}

	// Ask for the quantity of food 1 or 2 and use the value
	public abstract void actionFood();

	// Use value 1 or 2 to launch hand or shower
	public abstract void actionClean();

	// Use value 1 or 2 to start kit or hospital
	public abstract void actionHealth();

	// Use value 1 or 2 to start bestFriend or party
	public abstract void actionSocial();

	// Use value 1 or 2 to start nap or night
	public abstract void actionSlepp();

	// Ask for the 'times', 1 or 2 of sport and use the value
	public abstract void actionSport();

	// Use value 1 or 2 to start relax or smoke
	public abstract void actionRelax();

	// Change the tint
	public void actionTint() {

		System.out.println(T33.question[7]);
		String n1 = Clavier.lireString();

		for (int a = 0; a < T33.colorair.length; a++) {
			T33.colorair[a].equals(n1);
		}
			this.tint = n1;	
	}
	//Change the mask state
	public void actionMack() {
		System.out.println(T33.question[4]);
		String mask = Clavier.lireString();
		if (mask.equals("oui")) {
			setHealth(health * 2);
		} else if (mask.equals("non")) {
			setMask("non masquer");
			setHealth(health / 2);	
		} else {
			System.out.println(T33.textRepeat[2]);	
		}
		change();
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
	protected void relax(int quant) {
		aging();
		setMood(bornC(getMood() + (5 * rand())));
	}

	// Applies growth and modifies action parameters
	protected void smoke(int quant) {
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
		if ((this.lifeTime < 0) || (this.age > 100) || (this.health < 0) || (this.hunger < 0)) {
			System.out.println(T33.decoration[5]);
			System.out.println("\n" + T33.textRepeat[0] + " mort....]" + T33.decoration[7] + "\n"
					+ "Durée de vie restante : " + this.lifeTime + "\nAge: " + this.age + "\nSanter  :" + this.health
					+ T33.decoration[7] + "\n");
			Tamagoscript2.animal();
		}
	}

//STATE AND EMOTION
	// Give general state
	public void stateFeeling() {
		System.out.println(T33.decoration[7] + "\n" + T33.textRepeat[0] + " "
				+ stateMood(mood) + " plutôt " + stateCleaning(cleaning) + " et " + stateHealth(health) + " ]\n");
		System.out.println("[il est " + stateHunger(hunger) + " et il est plutôt " + stateSocial(social) + "]");
	}

	// Gives the mood state
	public String stateMood(double mood) {
		String happy = T33.stateList[0];
		String Bad = T33.stateList[1];
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
		String clean = T33.stateList[2];
		String durt = T33.stateList[3];
		String veryDurt = T33.stateList[8];
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
		String healthy = T33.stateList[4];
		String hurt = T33.stateList[5];
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
		String Satisfy = T33.stateList[6];
		String starve = T33.stateList[7];
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
		String popular = T33.stateList[9];
		String normal = T33.stateList[10];
		String misfit = T33.stateList[11];

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
			System.out.println(T33.question[8]);
			int n = Clavier.lireInt();
			switch (n) {
			case 1: {
				System.out.println(T33.question[9]+"\n"+T33.decoration[6]);
				babby();
			}
			case 2: {
				interaction();
			}
			default: {
				System.out.println(T33.textRepeat[2]);
				sexState();
			}
			}

		}
	}

	// Create a new baby with random attribut.
	public void babby() {
		if (variety == "Dragon") {
			lifeTime = 90;
		}
		if (variety == "Chien") {
			lifeTime = 25;
		}
		if (variety == "Chat") {
			lifeTime = 25;
		}
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
		System.out.println(T33.question[10]);
		String n1;
		do {
			n1 = Clavier.lireString();
		}
		while (!n1.equals(T33.colorair[0]) && !n1.equals(T33.colorair[1]) && !n1.equals(T33.colorair[2]) && !n1.equals(T33.colorair[3])
				&& !n1.equals(T33.colorair[4]) && !n1.equals(T33.colorair[5]) && !n1.equals(T33.colorair[6])
				&& !n1.equals(T33.colorair[7]) && !n1.equals(T33.colorair[8]) && !n1.equals(T33.colorair[9])
				&& !n1.equals(T33.colorair[10]));
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
		System.out.println(T33.question[10]);
		String n1;
		do {
			n1 = Clavier.lireString();
		}

		while (!n1.equals(T33.colorair[0]) && !n1.equals(T33.colorair[1]) && !n1.equals(T33.colorair[2]) && !n1.equals(T33.colorair[3])
				&& !n1.equals(T33.colorair[4]) && !n1.equals(T33.colorair[5]) && !n1.equals(T33.colorair[6])
				&& !n1.equals(T33.colorair[7]) && !n1.equals(T33.colorair[8]) && !n1.equals(T33.colorair[9])
				&& !n1.equals(T33.colorair[10]));
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
