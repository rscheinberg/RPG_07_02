public class Character {
	
	//fields
	private int health;
	private int strength;
	private int defense;
	private double attackRating;
	
	/*
	*  Instance Method
	*  - @return false if @health is <= 0, true otherwise
	*/
	public boolean isAlive () {
		return health >= 0;
	}
	
	/*
	*  Instance Method
	*  - @return @defense field of object
	*/
	public int getDefense () {
		return defense;
	}
	
	/*
	*  Instance Method
	*  Lowers @health field of object by inputted @amount
	*/
	public void lowerHP (int amount) {
		health -= amount;
	}
	
	/*
	*  Instance Method
	*  - Calculates and @return the damage directed at a the @Monster @target inputted
	*/
	public int attack (Character target) {
    	return (int) (strength * attackRating - defense);
	}
}
