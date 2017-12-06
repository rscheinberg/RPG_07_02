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
		return "This character is a Medic." + System.lineseparator() +
						super.toString();	}
}
