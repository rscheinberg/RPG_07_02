/*
*  Zombie Class
*  - Used for monster game
*  - Sublcass of Monster
*/
public class Zombie extends Monster{

	public Zombie () {
		health = 45;
		strength = 10;
		defense = 50;
		attackRating = .5;
	}

	public String toString () {
		return "This character is a Zombie." + System.lineSeparator() +
						super.toString();
	}
}
