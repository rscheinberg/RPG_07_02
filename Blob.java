/*
*  Blob Class
*  - Used for monster game
*  - Sublcass of Monster
*/
public class Blob extends Monster{

	public Blob () {
		health = 15;
		strength = 5;
		defense = 20;
		attackRating = .15;
	}

	public String toString () {
		return "This character is a Blob." + System.lineSeparator() +
						super.toString();	}
}
