/*
*  Vampire Class
*  - Used for monster game
*  - Sublcass of Monster
*/
public class Vampire extends Monster{

	public Vampire () {
		health = 30;
		strength = 15;
		defense = 20;
		attackRating = .15;
	}

	public String toString () {
		return "This character is a Vampire." + System.lineSeparator() +
						super.toString();
	}
}
