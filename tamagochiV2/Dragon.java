package tamagochiV2;

import java.util.Arrays;

public class Dragon extends Tamago2{


	public Dragon() {
		
		setVariety("Dragon");
		setName("Smoog");
		setLifeTime(90);
		setSize(100);
		setMood(20.0);
		setCleaning(20.0);
		
		
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
	public Dragon(String name, String color, String variety, double age, int size, double lifeTime, String mask,
			int hunger, int health, String tint, int sex, int mood, int social, int cleaning) {
		super(name, color, variety, age, size, lifeTime, mask, hunger, health, tint, sex, mood, social, cleaning);

	
	}


		}	


