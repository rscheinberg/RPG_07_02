/*
*  DeathRobot Class
*  - Used for monster game
*  - Sublcass of Protagonist
*/

//Abstract Error: error: DeathRobot is not abstract and does not override abstract method toString() in Protagonist
public class DeathRobot extends Protagonist{

	public DeathRobot (String name) {
		super(name);
		health = 200;
		strength = 25;
		defense = 20;
		attackRating = .5;
	}

	public String toString () {
		String name_ = "Name: " + name + System.lineSeparator();
		String health_ = "Health: " + health + System.lineSeparator();
		String strength_ = "Strength: " + strength + System.lineSeparator();
		String defense_ = "Defense: " + defense + System.lineSeparator();
		String attackRating_ = "Attack Rating: " + attackRating + System.lineSeparator();
		return "This character is a Death Robot." + System.lineSeparator() + name_ + health_ + strength_ + defense_ + attackRating_;	
}
