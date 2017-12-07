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
		return "This character is a Shooter." + System.lineSeparator() +
						super.toString();	}
}
