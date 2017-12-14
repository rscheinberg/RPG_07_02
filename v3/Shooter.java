/*
*  Shooter Class
*  - Used for monster game
*  - Sublcass of Protagonist
*/
public class Shooter extends Protagonist{

	public Shooter (String name) {
		super(name);
		health = 50;
		strength = 5;
		defense = 20;
		attackRating = 5.0;
	}

	public String toString () {
		String name_ = "Name: " + name + System.lineSeparator();
		String health_ = "Health: " + health + System.lineSeparator();
		String strength_ = "Strength: " + strength + System.lineSeparator();
		String defense_ = "Defense: " + defense + System.lineSeparator();
		String attackRating_ = "Attack Rating: " + attackRating + System.lineSeparator();
		return "This character is a Shooter." + System.lineSeparator() + name_ + health_ + strength_ + defense_ + attackRating_;		}
}
