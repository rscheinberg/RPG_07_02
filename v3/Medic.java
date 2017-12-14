/*
*  Medic Class
*  - Used for monster game
*  - Sublcass of Protagonist
*/
public class Medic extends Protagonist{

	public Medic (String name) {
		super(name);
		health = 75;
		strength = 5;
		defense = 40;
		attackRating = .25;
	}

	public String toString () {
		String name_ = "Name: " + name + System.lineSeparator();
		String health_ = "Health: " + health + System.lineSeparator();
		String strength_ = "Strength: " + strength + System.lineSeparator();
		String defense_ = "Defense: " + defense + System.lineSeparator();
		String attackRating_ = "Attack Rating: " + attackRating + System.lineSeparator();
		return "This character is a Medic." + System.lineSeparator() + name_ + health_ + strength_ + defense_ + attackRating_;	}
}
