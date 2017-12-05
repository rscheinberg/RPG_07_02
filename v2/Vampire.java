/*
*  Vampire Class
*  - Used for monster game
*  - Sublcass of Monster
*/
public class Vampire extends Protagonist{
	
	public Medic () {
		super();
		health = 30;
		strength = 15;
		defense = 20;
		attackRating = .15;
	}

	public String toString () {
		return super.toString();
	}
}
