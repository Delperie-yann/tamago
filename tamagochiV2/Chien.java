package tamagochiV2;

public class Chien extends Tamago2{

	public Chien() {
		
		setName("Scobydou");
		setVariety("Chien");
		setLifeTime(15);
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


	}	

