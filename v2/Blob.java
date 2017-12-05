/*
*  Blob Class
*  - Used for monster game
*  - Sublcass of Monster
*/
public class Medic extends Protagonist{
	
	public Medic () {
		super();
		health = 15;
		strength = 5;
		defense = 20;
		attackRating = .15;
	}

	public String toString () {
		return super.toString();
	}
}
